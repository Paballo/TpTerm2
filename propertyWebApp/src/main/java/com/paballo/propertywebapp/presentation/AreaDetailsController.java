/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation;

import com.paballo.propertywebapp.domain.AreaDetails;
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
@RequestMapping(value = "api/areadetails")
public class AreaDetailsController {
    
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody AreaDetails areaDetails)
    {
        System.out.println("Create the Called");
        return "";
    }
    
    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody AreaDetails areaDetails)
    {
        System.out.println("Update Called");
        return "";
    }
    
    @RequestMapping(value = "club/{id}")
    @ResponseBody
    public AreaDetails getAreaDetails(@PathVariable String id)
    {
        System.out.println("ID called");
        return null;
    }
    @RequestMapping(value = "areaDetails")
    @ResponseBody
    public List<AreaDetails> getAreaDetails()
    {
        System.out.println("The AREADETAILS");
        return null;
    }
    @RequestMapping(value = "club/{name}")
    @ResponseBody
    public AreaDetails getAreaDetailsName(@PathVariable String id)
    {
        System.out.println("The AreaDetails Name");
        return null;
    }
           
}

