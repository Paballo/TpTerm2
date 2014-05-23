/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.Properties;
import com.paballo.propertywebapp.repository.PropertiesRepository;
import com.paballo.propertywebapp.services.PropertyService;
import java.util.List;
import org.hibernate.criterion.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class PropertyServiceImpl implements PropertyService{
    
    @Autowired
    private PropertiesRepository propertyRepository;

    @Override
    public List<Properties> getTotalProperty() {
        
        return propertyRepository.findAll();
        
    }
    
}
