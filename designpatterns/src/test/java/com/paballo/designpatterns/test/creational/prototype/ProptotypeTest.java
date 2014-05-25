/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.creational.prototype;

import com.paballo.designpatterns.creational.prototype.Duck;
import com.paballo.designpatterns.creational.prototype.Person;
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
public class ProptotypeTest {
    
    public ProptotypeTest() {
    }

    @Test
    public void hello() {
    
        Person person1 = new Person("Mageto");
        Assert.assertEquals(person1.toString(), "Mageto");   
        
        Person person2 = (Person) person1.doClone();
        Assert.assertEquals(person2.toString(),"Mageto");
    }
    @Test
    public void hello2() {
    
        Duck duck = new Duck("quak");
        Assert.assertEquals(duck.toString(), "This duck says quak");
        
    
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
