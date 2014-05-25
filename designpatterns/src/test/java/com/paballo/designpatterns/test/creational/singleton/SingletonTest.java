/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.creational.singleton;

import com.paballo.designpatterns.creational.Singleton.Singleton;
import java.util.Date;
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
public class SingletonTest {
    
    private final Date   date = new Date();
    
    public SingletonTest() {
    }

    @Test
    public void UseSingleTon() 
    {
        Singleton singleton = Singleton.instance();
        
        Assert.assertNotSame(singleton.getDate(), date);
        System.out.println( "Date from singleton class    : " + singleton.getDate());
        System.out.println("Date from test class instance : " + date);
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
