/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.behavioral.ChainOfResponsibility;



/**
 *
 * @author donkey
 */
public class MercuryHandler extends PlanetHandler {
    
    
    @Override
    public void handleRequest(PlanetEnum request) {
         if(request == PlanetEnum.MERCURY)
        {
            System.out.println(request);
        }
        else
        {
            System.out.println(request);
            if(successor != null)
            {
            successor.handleRequest(request);
            }
        }
    }

   
    
}
