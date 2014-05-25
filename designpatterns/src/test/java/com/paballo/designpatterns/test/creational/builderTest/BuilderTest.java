/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.creational.builderTest;

import com.paballo.designpatterns.creational.builder.ItalianMealBuilder;
import com.paballo.designpatterns.creational.builder.JapaneseMealBuilder;
import com.paballo.designpatterns.creational.builder.Meal;
import com.paballo.designpatterns.creational.builder.MealBuilder;
import com.paballo.designpatterns.creational.builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    @Test
    public void hello() {
        
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructorMeal();
        Meal meal = mealDirector.getMeal();
        
        Assert.assertEquals(meal.toString(), "red wine");
    }
    @Test
    public void hello2() {
        
        MealBuilder mealBuilder = new JapaneseMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructorMeal();
        Meal meal = mealDirector.getMeal();
        
        Assert.assertEquals(meal.toString(), "sake");
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
