/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LocationTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.locationPackage.AreaStats;
import com.mycompany.property.model.locationPackage.Location;
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
public class LocationTest {
    
    private static Location.Builder location;
    
    public LocationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    
        location.location("pretoria").location();
        Assert.assertEquals(location.location().getCity(), "pretoria");
    
    }
    @Test
    public void hello2() {
     location.location("kimberly").location();
        Assert.assertEquals(location.location().getCity(), "kimberly");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        location = (Location.Builder)ctx.getBean("location");
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
