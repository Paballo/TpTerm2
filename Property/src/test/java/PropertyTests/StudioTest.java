package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.StandardHouse;
import com.mycompany.property.model.propertyPackage.Studio;
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
public class StudioTest {
    
    private static Studio.Builder studio;
    
    public StudioTest() {
    }

    @Test
    public void hello() {
        studio.studio(20).studio();
        Assert.assertEquals(studio.studio().getArea(), 20, 20.1);
    }
    @Test
    public void hello2() {
    studio.studio(15).studio();
        Assert.assertEquals(studio.studio().getArea(), 15, 15.1);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        studio = (Studio.Builder)ctx.getBean("studio");
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
