/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accomodationTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.accomodationPackage.Impl.BackPackers;
import com.mycompany.property.model.accomodationPackage.Impl.BedAndBreakfast;
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
public class BedAndBreakfastTest {
    
    private static BedAndBreakfast.Builder bedAndBreakfast;
    
    public BedAndBreakfastTest() {
    }

    @Test
    public void bedAndBreakfastTests() {
    bedAndBreakfast.bedAndBreakfast(true).bedAndBreakfast();
    Assert.assertEquals(bedAndBreakfast.bedAndBreakfast().isSelfServing(), true);
    }
    @Test
    public void bedAndBreakfast2Tests() {
    bedAndBreakfast.bedAndBreakfast(false).bedAndBreakfast();
    Assert.assertEquals(bedAndBreakfast.bedAndBreakfast().isSelfServing(), false);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        bedAndBreakfast = (BedAndBreakfast.Builder)ctx.getBean("bedandbreakfast");
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
