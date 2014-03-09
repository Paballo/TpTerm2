/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.userPackage.Impl.Renting;
import com.mycompany.property.model.userPackage.Impl.UserBuying;
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
public class UserBuyingTests {
    
    private  static UserBuying.Builder userBuying;
    
    public UserBuyingTests() {
    }

    @Test
    public void userBuyingsTest() {
    userBuying.userBuying(true).userBuying();
    Assert.assertEquals(userBuying.userBuying().isFamily(), true);
        
    }
    @Test
    public void userBuying2sTest() {
    userBuying.userBuying(false).userBuying();
    Assert.assertEquals(userBuying.userBuying().isFamily(), false);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        userBuying = (UserBuying.Builder)ctx.getBean("userbuying");
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
