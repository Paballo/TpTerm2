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
public class WingDecorator extends AnimalDecorator {

    public WingDecorator(Animalio animalio) {
        super(animalio);
    }
    
    @Override
    public void describe()
    {
        animalio.describe();
        System.out.println("I ahve wings");
        fly();
    }

    private void fly() {
        System.out.println("I can Fly");
    }
    
    
}
