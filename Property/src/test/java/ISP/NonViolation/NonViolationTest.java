/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ISP.NonViolation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.ISP.NonViolation.Service.Impl.FlatClass;
import Property.DesignPrinciples.ISP.NonViolation.Service.Impl.PlaneClass;
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
public class NonViolationTest {
    
    PlaneClass planeClass;
    FlatClass  flatClass;
    
    
    public NonViolationTest() {
    }

    
    @Test
    public void testISP() {
    Assert.assertEquals(planeClass.doors(), 3);
    }
    @Test
    public void testISP2() {
    Assert.assertEquals(flatClass.stoves(), 1);
    }

    @BeforeClass
    public void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        
        flatClass = (FlatClass)ctx.getBean("ISP4");
        planeClass = (PlaneClass)ctx.getBean("ISP3");
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
