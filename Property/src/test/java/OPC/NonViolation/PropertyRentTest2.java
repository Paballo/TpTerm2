/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPC.NonViolation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.OCP.NonViolation.Service.Impl.PropertyRent2;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class PropertyRentTest2 {
    
    PropertyRent2 propertyRent2;
    
    public PropertyRentTest2() {
    }

    
    @Test
    public void hello() 
    {
      double  installement = propertyRent2.rent(1, 24000);
        
        Assert.assertEquals(installement, 24000, 2000.1);
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        propertyRent2 = (PropertyRent2)ctx.getBean("OCP2");
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
