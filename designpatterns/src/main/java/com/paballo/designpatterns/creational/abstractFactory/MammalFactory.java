/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.abstractFactory;

/**
 *
 * @author donkey
 */
public class MammalFactory extends SpeciesFactory {

    @Override
    public Animals getAnimals(String type) {
       
        if("cow".equals(type))
        {
            return  new Cow();
        }
        else
        {
            return new Sheep();
        }
        
    }
    
    
}
