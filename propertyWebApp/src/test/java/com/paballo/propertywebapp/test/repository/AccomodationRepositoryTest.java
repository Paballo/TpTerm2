/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
*/
package com.paballo.propertywebapp.test.repository;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.Accomodation;
import com.paballo.propertywebapp.repository.AccomodationRepository;
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
 * */

public class AccomodationRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    
    private AccomodationRepository repos;
    
    public AccomodationRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createAccomodation() 
    {
        repos = ctx.getBean(AccomodationRepository.class);
        
        Accomodation ac = new Accomodation.Builder()
                                          .name("FormulaOne")
                                          .type("Hotel")
                                          .price(599)
                                          .build();
        repos.save(ac);
        id = ac.getId();
        Assert.assertNotNull(ac);
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
