/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.creational.abstractfactoryTest;

import com.paballo.designpatterns.creational.abstractFactory.Abstractfactory;
import com.paballo.designpatterns.creational.abstractFactory.Animals;
import com.paballo.designpatterns.creational.abstractFactory.SpeciesFactory;
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
public class abstractfactorytest {
    Abstractfactory abstractFactory = new Abstractfactory();
    
    public abstractfactorytest() {
    }

   
    @Test
    public void hello() {
    
        
        
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animals al = speciesFactory1.getAnimals("snake");
        
       
        
        Assert.assertEquals(al.makeSound(), "Hiss");
        
    }
    @Test
    public void Hello2()
    {
        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animals al2 = speciesFactory2.getAnimals("cow");
        Assert.assertEquals(al2.makeSound(), "Moo");
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
