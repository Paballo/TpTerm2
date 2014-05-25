/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.builder;

/**
 *
 * @author donkey
 */
public class Meal {
    private String drink;
    private String mainCourse;
    private String side;
    
    public String getDrunk()
    {
        return drink;
    }
    public void setDrink(String drink)
    {
        this.drink = drink;
    }
    
    public String getMainCourse()
    {
        return mainCourse;
    }
    public void setMainCourse(String mainCourse)
    {
        this.mainCourse = mainCourse;
    }
    
    public String getSide()
    {
        return side;
    }
    public void setSide(String side)
    {
        this.side = side;
    }
    
    public String toString()
    {
        return drink;
    }
            
}
