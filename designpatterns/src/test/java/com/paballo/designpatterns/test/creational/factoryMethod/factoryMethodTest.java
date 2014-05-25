/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.creational.factoryMethod;

import com.paballo.designpatterns.creational.factoryMethod.Animal;
import com.paballo.designpatterns.creational.factoryMethod.AnimalFactory;
import com.paballo.designpatterns.creational.factoryMethod.AnimalFactory;
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
public class factoryMethodTest {
    
    
    
    public factoryMethodTest() {
    }
    
    @Test
    public void UsefactoryMethodTest()
    {
        AnimalFactory animalFactory = AnimalFactory.getInstance();
        
        Animal animal = animalFactory.getAnimal("canine");
        
        Assert.assertEquals(animal.makeSound(), "Woof");
    }
    @Test
    public void UsefactoryMethodTest2()
    {
        AnimalFactory animalFactory = AnimalFactory.getInstance();;
        
        Animal animal = animalFactory.getAnimal("feline");
        
        Assert.assertEquals(animal.makeSound(), "Meow");
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
