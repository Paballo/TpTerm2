/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.repository;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.AreaDetails;
import com.paballo.propertywebapp.repository.AreaDetailsRepository;
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
public class AreaDetailsRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    private AreaDetailsRepository repos;
    
    
    public AreaDetailsRepositoryTest() {
    }
    @Test
    public void createArea() {
        
        repos = ctx.getBean(AreaDetailsRepository.class);
        AreaDetails ads = new AreaDetails.Builder()
                                         .averageTemp(23)
                                         .lowestTemp(2)
                                         .highestTemp(35)
                                         .status("middle-class")
                                         .build();
        repos.save(ads);
        id = ads.getId();
        Assert.assertNotNull(ads);
                                     
    
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
