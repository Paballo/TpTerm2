/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRP.NonViolation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.SRP.NonViolation.Service.HouseSizeClass;
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
public class HouseSizeClassTest {
    
    HouseSizeClass houseSizeClass;
    
    public HouseSizeClassTest() {
    }

    
    @Test
    public void HouseClassTestArea() {
    
        Assert.assertEquals(10, houseSizeClass.area(2, 5));
    }
    @Test
    public void HouseClassTestVolume()
    {
        Assert.assertEquals(8, houseSizeClass.volume(2, 2, 2));
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        houseSizeClass = (HouseSizeClass)ctx.getBean("SRP2");
        
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
