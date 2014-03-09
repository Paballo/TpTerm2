/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.userPackage.Impl.Bond;
import com.mycompany.property.model.userPackage.Impl.Buying;
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
public class BuyingTest {
    
    private static Buying.Builder buying;
    
    public BuyingTest() {
    }

    @Test
    public void buyingTests() {
    buying.buying(6000).buying();
    Assert.assertEquals(buying.buying().getPrice(), 6000, 6000.1);
    }
    @Test
    public void buyingTest2s() {
    buying.buying(8000).buying();
    Assert.assertEquals(buying.buying().getPrice(), 8000, 8000.1);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        buying = (Buying.Builder)ctx.getBean("buying");
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
