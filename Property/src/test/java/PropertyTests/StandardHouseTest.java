package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.PentHouse;
import com.mycompany.property.model.propertyPackage.StandardHouse;
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
public class StandardHouseTest {
    
    private static StandardHouse.Builder standardHouse;
        
    public StandardHouseTest() {
    }

    
    @Test
    public void hello() {
        standardHouse.house(true).stHouse();
        Assert.assertEquals(standardHouse.stHouse().isYard(), true);        
    }
    @Test
    public void hello2() {
    standardHouse.house(false).stHouse();
        Assert.assertEquals(standardHouse.stHouse().isYard(), false); 
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        standardHouse = (StandardHouse.Builder)ctx.getBean("standardHouse");
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
