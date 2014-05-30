/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation.rest;

import com.paballo.propertywebapp.domain.StudentAccomodation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author donkey
 */
public class StudentAccomodationRestController {
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody StudentAccomodation studentAccomodation)
    {
        System.out.println("create the called");
        return "";
    }
    
    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody StudentAccomodation studentAccomodation)
    {
        System.out.println("Update Called");
        return "";
    }
    
   // @RequestMapping(value = "id/{id}")
    
}
