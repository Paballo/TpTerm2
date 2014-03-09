/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.locationPackage.Location;
import com.mycompany.property.model.userPackage.Impl.Bond;
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
public class BondTest {
    
    private static Bond.Builder bond;
    
    public BondTest() {
    }

    
     @Test
     public void bondTests() {
     bond.bond(20).bond();
     
     Assert.assertEquals(bond.bond().getYears(), 20);
     }
     @Test
     public void bondTest2s() {
     bond.bond(15).bond();
     
     Assert.assertEquals(bond.bond().getYears(), 15);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        bond = (Bond.Builder)ctx.getBean("bond");
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
