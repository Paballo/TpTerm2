/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.services;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.Agent;
import com.paballo.propertywebapp.services.AgentService;
import com.paballo.propertywebapp.services.Impl.AgentServiceImpl;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class AgentServiceTest {
    public static ApplicationContext ctx;
    
    private AgentService service;
    
    
    public AgentServiceTest() {
    }

    
    @Test
    public void Total() {
    
            service = ctx.getBean(AgentService.class);
            
            List<Agent> agent = service.getTotalAgent();
            
            Assert.assertEquals(1,agent.size(),"Only 1 person");
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
