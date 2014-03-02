/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LSP.NonViolation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.LSP.NonViolation.Service.Impl.HouseRectangle;
import Property.DesignPrinciples.LSP.NonViolation.Service.Impl.HouseSquare;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class TestLSP2 {
    
    HouseRectangle houseRectangle;
    HouseSquare houseSquare;
    
    public TestLSP2() {
    }

    
     @Test
    public void HouseShapeTest() {
    
        Assert.assertEquals(houseRectangle.area(5, 10), 50);     
    }
     @Test
    public void HouseShapeTest2() {
    
        Assert.assertEquals(houseSquare.area(5, 5), 25);     
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        houseSquare = (HouseSquare)ctx.getBean("LSP3");
        
        houseRectangle = (HouseRectangle)ctx.getBean("LSP2");
           
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
