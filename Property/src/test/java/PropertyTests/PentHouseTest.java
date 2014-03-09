package PropertyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.propertyPackage.Loft;
import com.mycompany.property.model.propertyPackage.PentHouse;
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
public class PentHouseTest {
    
    private static PentHouse.Builder pentHouse;
    public PentHouseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    
        pentHouse.pentHouses("Protea Hotel").pentHouse();
        Assert.assertEquals(pentHouse.pentHouse().getBuilding(), "Protea Hotel");
    
    }
    @Test
    public void hello2() {
    
        pentHouse.pentHouses("Inscape").pentHouse();
        Assert.assertEquals(pentHouse.pentHouse().getBuilding(), "Inscape");
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        pentHouse = (PentHouse.Builder)ctx.getBean("penthouse");
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
