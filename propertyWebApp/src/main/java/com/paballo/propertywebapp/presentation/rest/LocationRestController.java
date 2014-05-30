/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation.rest;

import com.paballo.propertywebapp.domain.Location;
import com.paballo.propertywebapp.services.LocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author donkey
 */
@Controller
public class LocationRestController {
    
    @Autowired
    private LocationService locationService;
    
    @RequestMapping(value = "locations")
    @ResponseBody
    public Location getLocation()
    {
        Location l = null;
        List<Location> locations = locationService.getLocationTotal();
        System.out.println("The Collections size " + locations.size());
        return null;
        
    }
    
    
    
    
}
