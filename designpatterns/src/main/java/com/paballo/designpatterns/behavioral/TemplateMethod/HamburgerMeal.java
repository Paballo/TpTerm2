/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.behavioral.TemplateMethod;

/**
 *
 * @author donkey
 */
public class HamburgerMeal extends Meals {

    @Override
    public void prepareIngredients() {
        System.out.println("Getting burger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper");
    }
    
}
