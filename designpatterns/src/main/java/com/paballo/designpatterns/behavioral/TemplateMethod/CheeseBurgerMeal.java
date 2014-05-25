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
public class CheeseBurgerMeal extends Meals {

    @Override
    public void prepareIngredients() {
        
        System.out.println("Geeting beef");
        
    }

    @Override
    public void cook() {
        System.out.println("Cheese Burger");
        
    }

    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
        
    }
    
}
