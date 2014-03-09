/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accomodationTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.accomodationPackage.Impl.BedAndBreakfast;
import com.mycompany.property.model.accomodationPackage.Impl.Hotel;
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
public class HotelTest {
    
    private static Hotel.Builder hotel;
    
    public HotelTest() {
    }

    @Test
    public void hotelTests() {
    hotel.hotel(4).hotel();
    Assert.assertEquals(4, hotel.hotel().getStarRating());
    }
    @Test
    public void hotel2Tests() {
    hotel.hotel(7).hotel();
    Assert.assertEquals(7, hotel.hotel().getStarRating());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        hotel = (Hotel.Builder)ctx.getBean("hotel");
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
