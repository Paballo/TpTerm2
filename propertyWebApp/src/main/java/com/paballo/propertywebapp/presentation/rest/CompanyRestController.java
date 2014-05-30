/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation.rest;

import com.paballo.propertywebapp.domain.Company;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author donkey
 */
@Controller
@RequestMapping(value = "api/company")
public class CompanyRestController {
    
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Company company)
    {
        System.out.println("Create the called");
        return "";
    }
    
    @RequestMapping(value = "copmany/{id}")
    @ResponseBody
    public Company getCompany(@PathVariable String id)
    {
        System.out.println("ID called");
        return null;
    }
    
    @RequestMapping(value = "company")
    @ResponseBody
    public List<Company> getCompanies()
    {
        System.out.println("The Clubs");
        return null;
    }
    
    @RequestMapping(value = "club/{name}")
    @ResponseBody
    public Company getCompanyName(@PathVariable String id)
    {
        System.out.println("The Club name");
        return null;
    
        
    }
    
}
