package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.Land;
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
public class LandTest {
    private static Land.Builder land;
    public LandTest() {
    }
        
    @Test
    public void hello() {
        land.land("wilderness").land();
        Assert.assertEquals(land.land().getTerrain(), "wilderness");
    }
    @Test
    public void hello2() {
        land.land("forest").land();
        Assert.assertEquals(land.land().getTerrain(), "forest");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        land = (Land.Builder)ctx.getBean("land");
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
