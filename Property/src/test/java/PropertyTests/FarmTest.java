package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.Farm;
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
public class FarmTest {
    
    private static Farm.Builder farm;
    
    public FarmTest() {
    }

    
    @Test
    public void farmTest1() {
        farm.farmtype("animal").farm();
        Assert.assertEquals(farm.farm().getFarmType(), "animal");
    }
    @Test
    public void farmTest2() {
        farm.farmtype("plantation").farm();
        Assert.assertEquals(farm.farm().getFarmType(), "plantation");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        farm = (Farm.Builder)ctx.getBean("farm");
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
