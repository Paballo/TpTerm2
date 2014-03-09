package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.GolfEstate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class GolfEstateTest {
    
    private static GolfEstate.Builder golfEstate;
    
    public GolfEstateTest() {
    }
    
    @Test
    public void gE1() {
        
        golfEstate.golfEstates("Wooden").golfEstate();
        Assert.assertEquals(golfEstate.golfEstate().getStyle(), "Wooden");
    
    }
    @Test
    public void gE2() {
    
        golfEstate.golfEstates("Tuscan").golfEstate();
        Assert.assertEquals(golfEstate.golfEstate().getStyle(), "Tuscan");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        golfEstate = (GolfEstate.Builder)ctx.getBean("golfEstate");
        
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
