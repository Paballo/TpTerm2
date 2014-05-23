/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.Company;
import com.paballo.propertywebapp.repository.CompanyRepository;
import com.paballo.propertywebapp.services.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    
    @Override
    public List<Company> getTotalCompanies() {
        return companyRepository.findAll();
        
    }
    
}
