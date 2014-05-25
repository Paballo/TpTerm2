/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.structural.facade;

import com.paballo.designpatterns.structural.facade.Facade;
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
public class FacadeTest {
    
    Facade facade = new Facade();
    int x = 3;
    
    public FacadeTest() {
    }

    @Test
    public void hello1() 
    {
        Assert.assertEquals(facade.cubeX(x), 27);
        
       
    }
    @Test void hello2()
    {
        Assert.assertEquals(facade.cubeXTimes2(x), 54);
    }
    @Test void hello()
    {
         Assert.assertEquals(facade.xToSixthPowerTimes2(x), 1458);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
