/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.structural.decorator;



/**
 *
 * @author donkey
 */
public class LivingAnimal implements Animalio{

    @Override
    public void describe() {
        System.out.println("I am an animal");
    }
    
}
