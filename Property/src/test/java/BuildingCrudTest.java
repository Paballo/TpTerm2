/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.Services.Crud.BuildingCrudService;
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
public class BuildingCrudTest {
    
    @Mock
    BuildingCrudService  buildingCrudService;
    
    public BuildingCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        buildingCrudService = Mockito.mock(BuildingCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Building b1 = new Building.Builder(5, 300, "10").build();
        Building returnBuilding = buildingCrudService.persist(b1);
        when(buildingCrudService.persist(b1)).thenReturn(returnBuilding);
        Mockito.verify(buildingCrudService).persist(b1);
    }

    @Test
    public void testRead() throws Exception {
         Building b1 = new Building.Builder(5, 300, "10").build();
        Building returnBuilding = buildingCrudService.find(b1.getId());
        when(buildingCrudService.find(b1.getId())).thenReturn(returnBuilding);
        Mockito.verify(buildingCrudService).find(b1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Building b1 = new Building.Builder(5, 300, "10").build();

        Building returnQuestion = buildingCrudService.merge(b1);
        when(buildingCrudService.merge(b1)).thenReturn(returnQuestion);
        Mockito.verify(buildingCrudService).merge(b1);

    }

    @Test
    public void testDelete() throws Exception {

        Building b1 = new Building.Builder(5, 300, "10").build();
        Building returnQuestion = buildingCrudService.remove(b1);
        when(buildingCrudService.remove(b1)).thenReturn(returnQuestion);
        Mockito.verify(buildingCrudService).remove(b1);

    }
}
