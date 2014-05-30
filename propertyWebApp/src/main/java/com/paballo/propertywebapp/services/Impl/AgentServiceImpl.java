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



public class AgentServiceImpl implements AgentService {
    
    @Autowired
    private AgentRepository agentRepository;
    
    public Agent find(Long id)
    {
        return agentRepository.findOne(id);
    }
    
    public Agent persist(Agent entity)
    {
        return agentRepository.save(entity);
    }
    
    public Agent merge(Agent entity)
    {
        if(entity.getId()!= null)
        {
            return agentRepository.save(entity);
        }
        return null;
    }
    public void remove(Agent entity)
    {
        agentRepository.delete(entity);
    }
    
    public List<Agent> findAll()
    {
        return agentRepository.findAll();
    }
        
    
    
    
}
