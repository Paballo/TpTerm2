/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.factoryMethod.sub;

import com.paballo.designpatterns.creational.factoryMethod.Animal;

/**
 *
 * @author donkey
 */
public class Cat extends Animal{

    @Override
    public String makeSound() {
        return "Meow";
    }
    
}
