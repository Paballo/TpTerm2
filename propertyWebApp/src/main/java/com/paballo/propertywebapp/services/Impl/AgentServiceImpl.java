/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.services.Impl;

import com.paballo.propertywebapp.domain.Agent;
import com.paballo.propertywebapp.repository.AgentRepository;
import com.paballo.propertywebapp.services.AgentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author donkey
 */
@Service
public class AgentServiceImpl implements AgentService{
    
    @Autowired
    private AgentRepository agentRepository;
    

    @Override
    public List<Agent> getTotalAgent() 
    {
        return agentRepository.findAll();
        
    }
    
}
