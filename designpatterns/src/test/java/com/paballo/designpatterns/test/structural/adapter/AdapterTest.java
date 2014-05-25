/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.structural.adapter;

import com.paballo.designpatterns.structural.adapter.TemperatureClassReporter;
import com.paballo.designpatterns.structural.adapter.TemperatureInfo;
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
public class AdapterTest {
    
    public AdapterTest() {
    }
    
    @Test
    public void hello() {
        
       // TemperatureInfo tempInfo = new TemperatureClassReporter();
        Assert.assertEquals(true, true);
    
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
