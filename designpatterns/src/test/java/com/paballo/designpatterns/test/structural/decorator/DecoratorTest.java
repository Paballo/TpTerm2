/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.structural.decorator;

import com.paballo.designpatterns.structural.decorator.Animalio;
import com.paballo.designpatterns.structural.decorator.GrowlDecorator;
import com.paballo.designpatterns.structural.decorator.LegDecorator;
import com.paballo.designpatterns.structural.decorator.LivingAnimal;
import com.paballo.designpatterns.structural.decorator.WingDecorator;
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
public class DecoratorTest {
    
    Animalio animal;
    
    public DecoratorTest() {
        
    }

    @Test
    public void hello() {
        animal = new LegDecorator(animal);
        //animal.describe();;
   
    }
    
    @Test
    public void hello2() {
    animal = new LivingAnimal();
                animal.describe();}
    
    @Test
    public void hello3() {
        animal = new WingDecorator(animal);
        animal.describe();
    }
    
    @Test
    public void hello4()
    {
        animal = new GrowlDecorator(animal);
        animal.describe();
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
