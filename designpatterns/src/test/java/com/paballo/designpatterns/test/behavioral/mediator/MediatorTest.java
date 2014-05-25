/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.behavioral.mediator;

import com.paballo.designpatterns.behavioral.Mediator.Buyer;
import com.paballo.designpatterns.behavioral.Mediator.Mediator;
import com.paballo.designpatterns.behavioral.Mediator.SwedishBuyer;
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
public class MediatorTest {
    Mediator mediator = new Mediator();
    
    public MediatorTest() {
    }

    @Test
    public void hello() {
     //Buyer swedishBuyer = new SwedishBuyer(mediator);
    }
    @Test
    public void hello2() {
    }
    @Test
    public void hello3() {
    }
    @Test
    public void hello4() {
    }
    @Test
    public void hello5() {
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
