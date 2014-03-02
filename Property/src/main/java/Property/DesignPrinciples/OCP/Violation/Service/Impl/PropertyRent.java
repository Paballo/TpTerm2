/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.OCP.Violation.Service.Impl;

import Property.DesignPrinciples.OCP.Violation.Service.PropertyRentInterface;

/**
 *
 * @author donkey
 */
public class PropertyRent implements PropertyRentInterface{
    
    public  PropertyRent()
    {
        
    }

    @Override
    public double rent(int years,double price) {
        
        double installement ;
        
        if(years == 1)
        {
            installement = price / 12;
            
            return installement;
        }
        else if(years == 2)
        {
            installement = price/ 24;
            
            return installement;
        }
        
        else if(years == 3)
        {
            installement = price / 38;
            
            return installement;
        }
        
        return 0;
        
        
    }
    
    
    
}
