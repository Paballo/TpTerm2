/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services;

import com.paballo.propertywebapp.domain.Company;
import java.util.List;

/**
 *
 * @author donkey
 */
public interface CompanyService {
    
    //find company name
    
    
    //method to get the total amount of companies selling properties
    public List<Company> getTotalCompanies();
    
}
