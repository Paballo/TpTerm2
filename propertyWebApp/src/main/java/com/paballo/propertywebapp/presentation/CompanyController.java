/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation;

import com.paballo.propertywebapp.domain.Company;
import com.paballo.propertywebapp.services.CompanyService;
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
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;
    
    @RequestMapping(value = "company")
    @ResponseBody
    public Company getCompany()
    {
        Company c = null;
        List<Company> company = companyService.getTotalCompanies();
        System.out.println("The collection size is " + company.size());
        
        if(company.size() > 0)
        {
            c = company.get(0);
        }
        return c;
    }
    
   
    
}
