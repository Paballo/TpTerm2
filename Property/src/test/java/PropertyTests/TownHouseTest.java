package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.Studio;
import com.mycompany.property.model.propertyPackage.TownHouse;
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
public class TownHouseTest {
    
    private static TownHouse.Builder townHouse;
    
    public TownHouseTest() {
    }

   
    @Test
    public void hello() {
        townHouse.townHouse(2).townHouse();
        Assert.assertEquals(townHouse.townHouse().getGarage(), 2);
    }
    @Test
    public void hello2() {
        townHouse.townHouse(3).townHouse();
        Assert.assertEquals(townHouse.townHouse().getGarage(), 3);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        townHouse = (TownHouse.Builder)ctx.getBean("townHouse");
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
