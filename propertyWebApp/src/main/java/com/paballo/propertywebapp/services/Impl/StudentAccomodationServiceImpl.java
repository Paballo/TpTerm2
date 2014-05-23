/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.StudentAccomodation;
import com.paballo.propertywebapp.repository.StudentAccomodationRepository;
import com.paballo.propertywebapp.services.StudentAccomodationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class StudentAccomodationServiceImpl implements StudentAccomodationService{
    
    @Autowired
    private StudentAccomodationRepository studentAccomodationRepository;

    
    @Override
    public List<StudentAccomodation> getTotalAccomodation() {
        
        return studentAccomodationRepository.findAll();
    }
    
}
