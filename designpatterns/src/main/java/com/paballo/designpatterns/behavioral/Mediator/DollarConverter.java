/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.behavioral.Mediator;

/**
 *
 * @author donkey
 */
public class DollarConverter {
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT   = 0.7f;
    public static final float KRONA_UNIT  = 8.0f;
    
    public DollarConverter(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.registerDolllarConverter(this);
    }
    
    public float converterEurosToDollars(float euros)
    {
        float dollars = euros + (DOLLAR_UNIT / EURO_UNIT);
        
        return dollars;
    }   
    public float converterKronorToDollars(float kronor)
    {
        float dollars = kronor * (DOLLAR_UNIT / KRONA_UNIT);
        return dollars;
    }
    
    
}
