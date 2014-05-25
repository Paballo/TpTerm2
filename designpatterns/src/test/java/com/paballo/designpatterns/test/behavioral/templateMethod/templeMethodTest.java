/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.behavioral.templateMethod;

import com.paballo.designpatterns.behavioral.TemplateMethod.CheeseBurgerMeal;
import com.paballo.designpatterns.behavioral.TemplateMethod.HamburgerMeal;
import com.paballo.designpatterns.behavioral.TemplateMethod.Meals;
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
public class templeMethodTest {
    
    Meals meals; 
    
    public templeMethodTest() {
        meals = new HamburgerMeal();
        meals.doMeal();
    }

    @Test
    public void hello1() 
    {
        meals = new CheeseBurgerMeal();
        meals.doMeal();
    }
    @Test 
    public void hello()
    {
        
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
