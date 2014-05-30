/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation;

import com.paballo.propertywebapp.domain.Agent;
import com.paballo.propertywebapp.services.AgentService;
import java.util.List;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static org.omg.CORBA.ARG_INOUT.value;
import static org.omg.IOP.TAG_MULTIPLE_COMPONENTS.value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author donkey
 */
@Controller
public class AgentController {
    
    @Autowired
    private AgentService agentService;
    
    @RequestMapping(value = "agent")
    @ResponseBody
    public Agent getAgent()
    {
        Agent a = null;
        List<Agent> agents = agentService.findAll();
        
        System.out.println("THE Collection size" + agents.size());
        
        if(agents.size() > 0)
        {
            a = agents.get(0);
        }
        
    return a;
    }
    
  // RequestMapping(value = "agents")
    @ResponseBody
    public List<Agent> getAgents()
   {
        return agentService.findAll();
   }
}
