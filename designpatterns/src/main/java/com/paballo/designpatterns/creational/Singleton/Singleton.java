/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.creational.Singleton;

import java.util.Date;

/**
 *
 * @author donkey
 */

public class Singleton {
    
    private static Singleton theOnlyOne;
    private Date   d = new Date();
    
    private Singleton()
    {
        
    }
    
    public synchronized static Singleton instance()
    {
        if(theOnlyOne == null)
        {
            theOnlyOne = new Singleton();
        }
        return theOnlyOne;
    }
    public Date getDate()
    {
        return d;
    }
    
}
