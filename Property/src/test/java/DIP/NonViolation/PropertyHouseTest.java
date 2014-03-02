/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DIP.NonViolation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.DIP.NonViolation.Service.Impl.PropertyHouse;
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
public class PropertyHouseTest {
    
    PropertyHouse propertyHouse;
    
    public PropertyHouseTest() {
    }
    
    @Test
    public void testHouse() {
        
        String HOUSE  = propertyHouse.type();
        Assert.assertEquals("THIS IS A HOUSE", HOUSE);
        
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        propertyHouse = (PropertyHouse)ctx.getBean("DIP5");
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
