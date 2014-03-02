/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PolymorphismTest;

import Property.Config.PropertyConfig;
import Property.Polymorphism.Impl.DogHouse;
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
public class DogHouseTest {
     DogHouse dogHouse;
    public DogHouseTest() {
    }

    
    @Test
     public void hello() {
     
     Assert.assertEquals(dogHouse.roof(), 1);
     }

    @BeforeClass
    public  void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
         dogHouse = (DogHouse)ctx.getBean("poly");
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
