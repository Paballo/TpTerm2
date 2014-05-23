/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.services;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.AreaDetails;
import com.paballo.propertywebapp.services.AreaDetailsService;
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
public class AreaDetailsServiceTest {
    public static ApplicationContext ctx;
    
    private AreaDetailsService areaDetailsService;
    
    
    public AreaDetailsServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void AreaDetailsTotal() {
    
        areaDetailsService = ctx.getBean(AreaDetailsService.class);
        
        List<AreaDetails> areaDetails = areaDetailsService.getTotalDetails();
        
        Assert.assertEquals(1,areaDetails.size());
        
    
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
