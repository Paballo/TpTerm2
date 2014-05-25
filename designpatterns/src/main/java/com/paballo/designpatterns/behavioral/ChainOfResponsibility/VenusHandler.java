/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.behavioral.ChainOfResponsibility;

import com.paballo.designpatterns.behavioral.ChainOfResponsibility.PlanetHandler;
import com.paballo.designpatterns.behavioral.ChainOfResponsibility.PlanetEnum;

/**
 *
 * @author donkey
 */
public class VenusHandler extends PlanetHandler {
    
    public void handleRequest(PlanetEnum request)
    {
        if(request == PlanetEnum.VENUS)
        {
            System.out.println(request);
        }
        else
        {
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
    
}
