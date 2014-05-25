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
public class Mediator {
    
    Buyer swedishBuyer;
    Buyer frenchBuyer;
    AmericanSeller americanSeller;
    
    
    public void registerSwedishBuyer(SwedishBuyer swedishBuyer)
    {
        this.swedishBuyer = swedishBuyer;
    }
    public void registerFrenchBuyer(FrenchBuyer frenchBuyer)
    {
        this.frenchBuyer = frenchBuyer;
    }
    public void registerAmericaSeller(AmericanSeller americanSeller)
    {
        this.americanSeller = americanSeller; 
    }
    
    

    void registerDolllarConverter(DollarConverter aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
