/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ISP.Violation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.ISP.Violation.Service.Flat;
import Property.DesignPrinciples.ISP.Violation.Service.Plane;
import java.lang.annotation.Annotation;
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
public class ViolationTest {
    
    Plane plane;
    Flat  flat;
    
    public ViolationTest() {
    }

    
    
    @Test
    public void planeTest() {  
        Assert.assertEquals( 0, plane.stove());
    }
    @Test
    public void flatTest()
    {
        Assert.assertEquals(1, flat.stove());
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        flat = (Flat)ctx.getBean("ISP1");
        plane = (Plane)ctx.getBean("ISP2");
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
