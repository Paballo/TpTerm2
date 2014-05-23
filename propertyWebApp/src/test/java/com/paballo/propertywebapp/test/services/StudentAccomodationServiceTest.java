/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.services;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.StudentAccomodation;
import com.paballo.propertywebapp.services.StudentAccomodationService;
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
public class StudentAccomodationServiceTest {
    
    public static ApplicationContext ctx;
    
    private StudentAccomodationService studentAccomodationService;
    
    public StudentAccomodationServiceTest() {
    }

    
    @Test
    public void TotalAccomodation() {
        
        studentAccomodationService = ctx.getBean(StudentAccomodationService.class);
        List<StudentAccomodation> studentAccomodation = studentAccomodationService.getTotalAccomodation();
        Assert.assertEquals(0,studentAccomodation.size());
        
        
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
