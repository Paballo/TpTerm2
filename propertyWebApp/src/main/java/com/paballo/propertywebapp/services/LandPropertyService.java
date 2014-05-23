/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services;

import com.paballo.propertywebapp.domain.LandProperty;
import java.util.List;

/**
 *
 * @author donkey
 */
public interface LandPropertyService {
    
    //Buying
    //Animal Farms
    //Agricultural Farm
    //find land
    //most expenisive
    
    /**
     *
     * @return 
     */
        
    public List<LandProperty> getHighestPrice();
    
    public boolean findLandType(String landType);
    
    public List<LandProperty> CountTypesOfLand(String landType) ;
    
    public List<LandProperty> getTotalLands();
    
    
}
