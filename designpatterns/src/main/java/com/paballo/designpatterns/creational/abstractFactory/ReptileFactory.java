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
public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animals getAnimals(String type) {
        
        if("snake".equals(type))
        {
            return new Snake();
        }
        else
        {
            return new Tyrannosaurus();
        }
    }
    
    
}
