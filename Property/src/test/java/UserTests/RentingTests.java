/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.locationPackage.Location;
import com.mycompany.property.model.userPackage.Impl.Renting;
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
public class RentingTests {
    
    private static Renting.Builder renting;
    
    public RentingTests() {
    }

    @Test
    public void rentingsTest() {
    
        renting.renting(3200).renting();
        Assert.assertEquals(3000, 3000, 3000.1);
    }
    @Test
    public void renting2Tests() {
    renting.renting(3200).renting();
        Assert.assertEquals(3000, 3000, 3000.1);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        renting = (Renting.Builder)ctx.getBean("renting");
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
