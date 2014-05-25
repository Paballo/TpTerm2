/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.structural.bridge;

import com.paballo.designpatterns.structural.bridge.BigBus;
import com.paballo.designpatterns.structural.bridge.BigEngine;
import com.paballo.designpatterns.structural.bridge.SmallCar;
import com.paballo.designpatterns.structural.bridge.SmallEngine;
import com.paballo.designpatterns.structural.bridge.Vehicle;
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
public class BridgeTest {
    
    public BridgeTest() {
    }

    @Test
    public void hello1() 
    {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        
    }
    @Test
    public void hello2() 
    {
        Vehicle vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
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
