/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.repository;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.Agent;
import com.paballo.propertywebapp.repository.AgentRepository;
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
public class AgentRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    
    private AgentRepository repos;
    
    
    public AgentRepositoryTest() {
    }

    @Test
    public void createAgent() {
        
        repos   = ctx.getBean(AgentRepository.class);
        Agent a = new Agent.Builder()
                           .name("Jim")
                           .email("Jim@yahoo.com")
                           .number("+2776998845")
                           .build();
        repos.save(a);
        id = a.getId();
        Assert.assertNotNull(a);
        
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
