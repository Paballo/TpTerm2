/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.LandProperty;
import com.paballo.propertywebapp.repository.LandPropertyRepository;
import com.paballo.propertywebapp.services.LandPropertyService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class LandPropertyServiceImpl implements LandPropertyService{

    
    @Autowired
    private LandPropertyRepository landPropertyRepository;
    
    
    @Override
    public List<LandProperty> getHighestPrice() {
        
        return landPropertyRepository.findAll();
    }

    /**
     *
     * @param landType
     * @return
     */
    @Override
    public boolean findLandType(String landType) {
        
        boolean answer = true;
        List<LandProperty> landProperties = new ArrayList<>();
        List<LandProperty> allLandProperty = landPropertyRepository.findAll();
        
        /*for(LandProperty landProperty : allLandProperty)
        {
            if(landProperty.getType().equals(landType))
            {
                return true;
            }
        }*/
        
        for(int i = 0; i < allLandProperty.size();i++)
        {
            if(allLandProperty.contains(landType))
            {
                return answer;
            }
            else
                return answer = false;
            
        }
        
        return answer;
        
    }

    @Override
    public List<LandProperty> CountTypesOfLand(String landType) {
        return null;
        
    }

    @Override
    public List<LandProperty> getTotalLands() {
      
        return landPropertyRepository.findAll();
        
    }
    
}
