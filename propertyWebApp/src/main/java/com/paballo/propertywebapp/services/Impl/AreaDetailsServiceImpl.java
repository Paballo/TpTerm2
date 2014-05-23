/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.AreaDetails;
import com.paballo.propertywebapp.repository.AreaDetailsRepository;
import com.paballo.propertywebapp.services.AreaDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class AreaDetailsServiceImpl implements AreaDetailsService {

    @Autowired
    private AreaDetailsRepository areaRepository;
    
    
    @Override
    public List<AreaDetails> getTotalDetails() {
        return areaRepository.findAll();
    }
    
}
