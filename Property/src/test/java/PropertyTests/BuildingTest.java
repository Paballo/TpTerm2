package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.Building;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class BuildingTest {
    private static Building.Builder b;
 
    public BuildingTest() {
    }

    
    @Test
    public void hello() {
        b.floors(4).build();
        Assert.assertEquals(b.build().getFloors() , 4);
    }
    @Test
     public void hello1() {
         b.floors(5).build();
        Assert.assertEquals(b.build().getFloors() , 5);
        
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        b = (Building.Builder)ctx.getBean("building");
        
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
