/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.behavioral.ChainOfResponsibility;



import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;

/**
 *
 * @author donkey
 */
public class EarthHandler extends PlanetHandler {

    
    public void handleRequest(PlanetEnum request) {
         if(request == PlanetEnum.EARTH)
        {
            System.out.println(request);
        }
        else
        {
            System.out.println(request);
        }
        
    }

    
    
}
