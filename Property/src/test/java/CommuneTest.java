/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.Services.Crud.BackPackersCrudService;
import com.mycompany.property.Services.Crud.CommuneCrudService;
import com.mycompany.property.model.BackPackers;
import com.mycompany.property.model.Commune;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class CommuneTest {
    
    @Mock
    CommuneCrudService  communeCrudService;
    
    public CommuneTest() {
    }
  
    ;
    
   

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        communeCrudService = Mockito.mock(CommuneCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        
        Commune b1 = new Commune.Builder(5, "1").build();
       Commune returnCommune= communeCrudService.persist(b1);
        when(communeCrudService.persist(b1)).thenReturn(returnCommune);
        Mockito.verify(communeCrudService).persist(b1);
    }

    @Test
    public void testRead() throws Exception {
          Commune b1 = new Commune.Builder(5, "1").build();;
        Commune returnBackPackers = communeCrudService.find(b1.getId());
        when(communeCrudService.find(b1.getId())).thenReturn(returnBackPackers);
        Mockito.verify(communeCrudService).find(b1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Commune b1 = new Commune.Builder(5, "1").build();

        Commune returnBackPackers =  communeCrudService.merge(b1);
        when(communeCrudService.merge(b1)).thenReturn(returnBackPackers);
        Mockito.verify(communeCrudService).merge(b1);

    }

    @Test
    public void testDelete() throws Exception {

        Commune b1 = new Commune.Builder(5, "1").build();
        
        Commune returnBackPackers =  communeCrudService.remove(b1);
        when(communeCrudService.remove(b1)).thenReturn(returnBackPackers);
        Mockito.verify(communeCrudService).remove(b1);
    }
}
