/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.OCP.NonViolation.Service.Impl;

import Property.DesignPrinciples.OCP.Violation.Service.PropertyRentInterface;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author donkey
 */
public class PropertyRent2 implements PropertyRentInterface {

   

    @Override
    public double rent(int years, double price) {
        
        double Installement = 0;
        
        Map <Integer ,Integer> mRent;
        mRent = new HashMap<>();
        
        mRent.put(1,12);
        mRent.put(2,24);
        mRent.put(3,38);
        
        for(int key:mRent.keySet())
            for(int value: mRent.values())
                if(years == key )
                    Installement = price / key;
        
        return Installement;
    }

    
    
}
