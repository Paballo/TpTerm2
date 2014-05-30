/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation;

import com.paballo.propertywebapp.domain.Company;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author donkey
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    @ResponseBody
    public List<Company> getRndex()
    {
      
            List<Company> companies = new ArrayList<>();
            Company c1 = new Company.Builder().name("seef").build();
            Company c2 = new Company.Builder().name("PamGolding").build();
            Company c3 = new Company.Builder().name("pickfords").build();
            
            companies.add(c1);
            companies.add(c2);
            companies.add(c3);
            
            return companies;
            
        
    }
    
}
