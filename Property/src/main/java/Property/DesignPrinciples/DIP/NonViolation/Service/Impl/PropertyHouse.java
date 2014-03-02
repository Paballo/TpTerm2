/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.DIP.NonViolation.Service.Impl;

import Property.DesignPrinciples.DIP.NonViolation.Service.PropertyTypeInterface;

/**
 *
 * @author donkey
 */
public class PropertyHouse implements PropertyTypeInterface {

    @Override
    public String type() {
        
        String house = "THIS IS A HOUSE";
        
        return house;
        
    }
    
    
    
}
