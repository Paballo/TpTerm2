/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.builder;

/**
 *
 * @author donkey
 */
public class MealDirector {
    private MealBuilder mealBuilder = null;
    
    public MealDirector(MealBuilder mealBuilder)
    {
        this.mealBuilder = mealBuilder;
    }
    public void constructorMeal()
    {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();;
    }
    public Meal getMeal()
    {
        return mealBuilder.getMeal();
    }
    
}
