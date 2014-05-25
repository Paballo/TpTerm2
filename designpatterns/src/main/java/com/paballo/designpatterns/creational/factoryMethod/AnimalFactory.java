/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.factoryMethod;

import com.paballo.designpatterns.creational.factoryMethod.Animal;
import com.paballo.designpatterns.creational.factoryMethod.sub.Cat;
import com.paballo.designpatterns.creational.factoryMethod.sub.Dog;

/**
 *
 * @author donkey
 */
public class AnimalFactory {
    
    private static AnimalFactory animalFactory = null;
    
    private AnimalFactory()
    {
        
    }
    
    public static AnimalFactory getInstance()
    {
        if(animalFactory == null)
        {
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
    
    public Animal getAnimal(String type)
    {
        if("canine".equals(type))
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
    
}
