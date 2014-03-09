/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accomodationTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.accomodationPackage.Impl.BackPackers;
import com.mycompany.property.model.userPackage.Impl.Buying;
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
public class BackPackersTests {
    
    private static BackPackers.Builder backPackers;
    
    public BackPackersTests() {
    }

    @Test
    public void backPackersTest() {
    backPackers.backpacker("obz").backpacker();
    Assert.assertEquals(backPackers.backpacker().getName(), "obz");
    }
    @Test
    public void backPackers2Test() {
    backPackers.backpacker("rez").backpacker();
    Assert.assertEquals(backPackers.backpacker().getName(), "rez");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        backPackers = (BackPackers.Builder)ctx.getBean("backpackers");
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
