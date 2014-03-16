/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.Services.Crud.AreaStatCrud;
import com.mycompany.property.Services.Crud.BuildingCrudService;
import com.mycompany.property.model.AreaStats;
import com.mycompany.property.model.Building;
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
public class AreaStatTest {
    
    @Mock
    AreaStatCrud areaStatCrud;
    
    public AreaStatTest() {
    }
    
    
    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        areaStatCrud = Mockito.mock(AreaStatCrud.class);
    }

    @Test
    public void testCreate() throws Exception {
        AreaStats a1 = new AreaStats.Builder(8, "14").areaStats();
        AreaStats returnAreaStats = areaStatCrud.persist(a1);
        when(areaStatCrud.persist(a1)).thenReturn(returnAreaStats);
        Mockito.verify(areaStatCrud).persist(a1);
    }

    @Test
    public void testRead() throws Exception {
        AreaStats a1 = new AreaStats.Builder(8, "14").areaStats();
        AreaStats returnAreaStats = areaStatCrud.find(a1.getId());
        when(areaStatCrud.find(a1.getId())).thenReturn(returnAreaStats);
        Mockito.verify(areaStatCrud).find(a1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         AreaStats a1 = new AreaStats.Builder(8, "14").areaStats();

        AreaStats returnAreaStats = areaStatCrud.merge(a1);
        when(areaStatCrud.merge(a1)).thenReturn(returnAreaStats);
        Mockito.verify(areaStatCrud).merge(a1);

    }

    @Test
    public void testDelete() throws Exception {

        AreaStats a1 = new AreaStats.Builder(8, "14").areaStats();
        
        AreaStats returnAreaStats = areaStatCrud.remove(a1);
        when(areaStatCrud.remove(a1)).thenReturn(returnAreaStats);
        Mockito.verify(areaStatCrud).remove(a1);

    }
}
