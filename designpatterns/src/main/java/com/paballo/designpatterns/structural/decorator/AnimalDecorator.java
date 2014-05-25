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
public abstract  class AnimalDecorator  implements Animalio{

    Animalio  animalio;
    
    public AnimalDecorator(Animalio animalio)
    {
        this.animalio = animalio;
    }
    
    @Override
    public void describe() {
        
    }
    
}
