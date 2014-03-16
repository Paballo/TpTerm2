/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.Services.Crud.CommuneCrudService;
import com.mycompany.property.Services.Crud.FarmCrudService;
import com.mycompany.property.model.Commune;
import com.mycompany.property.model.Farm;
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
public class FarmTest {
    @Mock
    FarmCrudService  farmCrudService;
    
    public FarmTest() {
    }
 
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        farmCrudService = Mockito.mock(FarmCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        
       Farm b1 = new Farm.Builder("animal", "477").farm();
       Farm returnCommune= farmCrudService.persist(b1);
        when(farmCrudService.persist(b1)).thenReturn(returnCommune);
        Mockito.verify(farmCrudService).persist(b1);
    }

    @Test
    public void testRead() throws Exception {
         Farm b1 = new Farm.Builder("animal", "477").farm();
        Farm returnBackPackers = farmCrudService.find(b1.getId());
        when(farmCrudService.find(b1.getId())).thenReturn(returnBackPackers);
        Mockito.verify(farmCrudService).find(b1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

       Farm b1 = new Farm.Builder("animal", "477").farm();

        Farm returnBackPackers =  farmCrudService.merge(b1);
        when(farmCrudService.merge(b1)).thenReturn(returnBackPackers);
        Mockito.verify(farmCrudService).merge(b1);

    }

    @Test
    public void testDelete() throws Exception {

        Farm b1 = new Farm.Builder("animal", "477").farm();
        
        Farm returnBackPackers =  farmCrudService.remove(b1);
        when(farmCrudService.remove(b1)).thenReturn(returnBackPackers);
        Mockito.verify(farmCrudService).remove(b1);
    }
}
