/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.Services.Crud.AreaStatCrud;
import com.mycompany.property.Services.Crud.BackPackersCrudService;
import com.mycompany.property.model.AreaStats;
import com.mycompany.property.model.BackPackers;
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
public class BackPackersTest {
    
    @Mock
    BackPackersCrudService backPackersCrudService;
    
    public BackPackersTest() {
    }

    
    
    
    
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        backPackersCrudService = Mockito.mock(BackPackersCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        BackPackers b1 = new BackPackers.Builder("obz", "8").backpacker();
       BackPackers returnBackPackers = backPackersCrudService.persist(b1);
        when(backPackersCrudService.persist(b1)).thenReturn(returnBackPackers);
        Mockito.verify(backPackersCrudService).persist(b1);
    }

    @Test
    public void testRead() throws Exception {
         BackPackers b1 = new BackPackers.Builder("obz", "8").backpacker();
        BackPackers returnBackPackers = backPackersCrudService.find(b1.getId());
        when(backPackersCrudService.find(b1.getId())).thenReturn(returnBackPackers);
        Mockito.verify(backPackersCrudService).find(b1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

          BackPackers b1 = new BackPackers.Builder("obz", "8").backpacker();

        BackPackers returnBackPackers =  backPackersCrudService.merge(b1);
        when(backPackersCrudService.merge(b1)).thenReturn(returnBackPackers);
        Mockito.verify(backPackersCrudService).merge(b1);

    }

    @Test
    public void testDelete() throws Exception {

         BackPackers b1 = new BackPackers.Builder("obz", "8").backpacker();
        
        BackPackers returnBackPackers =  backPackersCrudService.remove(b1);
        when(backPackersCrudService.remove(b1)).thenReturn(returnBackPackers);
        Mockito.verify(backPackersCrudService).remove(b1);
    }

    }
