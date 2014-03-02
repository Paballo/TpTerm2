/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.ISP.NonViolation.Service.Impl;

import Property.DesignPrinciples.ISP.NonViolation.Service.FlatInterface;

/**
 *
 * @author donkey
 */
public class FlatClass implements FlatInterface {

    @Override
    public int doors() {
       
        return 1;
    }

    @Override
    public int stoves() {
        return 1;
       
    }
    
    
    
}
