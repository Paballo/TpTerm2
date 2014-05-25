/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.test.behavioral.chainOfResponsibility;

import com.paballo.designpatterns.behavioral.ChainOfResponsibility.EarthHandler;
import com.paballo.designpatterns.behavioral.ChainOfResponsibility.MercuryHandler;
import com.paballo.designpatterns.behavioral.ChainOfResponsibility.PlanetEnum;
import com.paballo.designpatterns.behavioral.ChainOfResponsibility.PlanetHandler;
import com.paballo.designpatterns.behavioral.ChainOfResponsibility.VenusHandler;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class chainOfResponsibility {

    
    
    
    public chainOfResponsibility() {
    }

    @Test
    public static void main(String[] args)
    {
        PlanetHandler chain = setChain();
        
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);
    }
    
    @Test
    public static PlanetHandler setChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler   = new VenusHandler();
        PlanetHandler earthHandler   = new EarthHandler();
        
        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);
        
        return mercuryHandler;
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
