/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPC.Violation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.OCP.Violation.Service.Impl.PropertyRent;
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
public class PropertyRentTest {
    
    private PropertyRent propertyRent;
    
    public PropertyRentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void propertyTest() 
    {
        double installment =  propertyRent.rent(1, 24000);
        
        Assert.assertEquals(installment, 2000, 2000.1);
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        propertyRent = (PropertyRent)ctx.getBean("OCP1");
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
