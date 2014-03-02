/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LSP.Violation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.LSP.Violation.Service.HouseSquareShape;
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
public class TestLSP {
    
    HouseSquareShape houseSquareShape;
    
    public TestLSP() {
    }

    
    @Test
    public void AreaTest() {
        
        houseSquareShape.setR_breadth(5);
        houseSquareShape.setR_length(5);
        
        Assert.assertEquals(houseSquareShape.getArea(), 0, "Violation expected and will double the original area");
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        houseSquareShape = (HouseSquareShape)ctx.getBean("LSP1");
        
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
