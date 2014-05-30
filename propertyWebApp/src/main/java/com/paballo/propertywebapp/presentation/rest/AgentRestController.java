/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation.rest;

import com.paballo.propertywebapp.domain.Agent;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author donkey
 */
@Controller
@RequestMapping(value = "api/agent")
public class AgentRestController {
    
    
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Agent agent)
    {
        System.out.println("Create the called");
        return "";
    }
    
    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody Agent agent)
    {
        System.out.println("Update Called");
        return "";
    }
    
    @RequestMapping(value = "agent/{id}")
    @ResponseBody
    public Agent getAgent(@PathVariable String id)
    {
        System.out.println("ID called");
        return null;
    }
    
    @RequestMapping(value = "agent/{name}")
    @ResponseBody
    public Agent getAgentName(@PathVariable String id)
    {
        System.out.println("The agency name");
        return null;
    }
    
    
    
    
}
