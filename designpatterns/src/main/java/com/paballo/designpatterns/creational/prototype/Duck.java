/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.prototype;

/**
 *
 * @author donkey
 */
public class Duck implements Prototype {
    
    String sound;

    public Duck(String sound)
    {
        this.sound = sound;
    }
    
    @Override
    public Prototype doClone() {
        return new Duck(sound);
    }
    
    public String toString()
    {
        return "This duck says " + sound;
    }
    
}
