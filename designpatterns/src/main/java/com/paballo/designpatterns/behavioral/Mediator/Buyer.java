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
public class Buyer {
    
    Mediator mediator;
    String unitOfCurrency;
    
    public Buyer(Mediator mediator, String unitOfCurrency)
    {
        this.mediator = mediator;
        this.unitOfCurrency = unitOfCurrency;
    }
    
    
    
}
