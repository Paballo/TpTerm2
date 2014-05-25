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
public class LegDecorator extends AnimalDecorator {

    public LegDecorator(Animalio animalio) {
        super(animalio);
    }
    
    @Override
    public void describe()
    {
        animalio.describe();;
        System.out.println("i have legs");
        dance();
    }

    public void dance() {
        System.out.print("I can dance");
    }
}
