/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.repository;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.Company;
import com.paballo.propertywebapp.repository.CompanyRepository;
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
public class CompanyRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    
    private CompanyRepository repos;
    
    public CompanyRepositoryTest() {
        
    }

    @Test
    public void createCompany() {
        repos = ctx.getBean(CompanyRepository.class);
        Company c = new Company.Builder()
                               .name("Seef")
                               .email("sales@seef.co.za")
                               .number("0218006930")
                               .build();
        repos.save(c);
        id = c.getId();
        Assert.assertNull(c);
        
        
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
