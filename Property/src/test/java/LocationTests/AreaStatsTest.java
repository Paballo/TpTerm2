/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LocationTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.locationPackage.AreaStats;
import com.mycompany.property.model.propertyPackage.Building;
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
public class AreaStatsTest {
    
    private static AreaStats.Builder areastats;
    public AreaStatsTest() {
    }

    
    @Test
    public void hello() {
    
            areastats.areaStats(23).areaStats();
            Assert.assertEquals(areastats.areaStats().getAverageWeather(), 23);
        
    }
    @Test
    public void hello2() {
     areastats.areaStats(10).areaStats();
            Assert.assertEquals(areastats.areaStats().getAverageWeather(), 10);
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        areastats = (AreaStats.Builder)ctx.getBean("areastats");
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
