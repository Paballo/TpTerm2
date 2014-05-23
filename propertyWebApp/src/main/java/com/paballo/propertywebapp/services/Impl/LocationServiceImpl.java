/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.Location;
import com.paballo.propertywebapp.repository.LocationRepository;
import com.paballo.propertywebapp.services.LocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository locationRepository;
    
    @Override
    public List<Location> getLocationTotal() {
        return locationRepository.findAll();
        
    }
    
}
