/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SRP.Violation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.SRP.Violation.Service.HouseSize;
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
public class HouseSizeTest {
    
    private HouseSize houseSize;
   
    
    public HouseSizeTest() {
    }

    
    @Test
    public void HouseSizeTest() {
    
        Assert.assertEquals(8, houseSize.houseSize(2, 2, 2));
    }
    
    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        houseSize = (HouseSize)ctx.getBean("SRP1");
        
        
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
