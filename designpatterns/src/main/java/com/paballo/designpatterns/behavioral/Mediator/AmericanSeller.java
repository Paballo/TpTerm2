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
public class AmericanSeller {
    Mediator mediator;
    float priceInDollars;
    
    public AmericanSeller(Mediator mediator, float priceInDollars)
    {
      this.mediator = mediator;
      this.priceInDollars = priceInDollars;
      this.mediator.registerAmericaSeller(this);
    }
    
    public boolean isBidAccepted(float bidInDollars)
    {
        if(bidInDollars >= priceInDollars)
        {
            System.out.println("Sellers");
            return true;
        }
        else
        {
            System.out.println("Sellers");
            return false;
        }
    }
}
