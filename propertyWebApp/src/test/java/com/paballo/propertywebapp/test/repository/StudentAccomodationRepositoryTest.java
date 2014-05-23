/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.repository;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.StudentAccomodation;
import com.paballo.propertywebapp.repository.StudentAccomodationRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
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
public class StudentAccomodationRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    private StudentAccomodationRepository repos;
    
    
    
    
    
    public StudentAccomodationRepositoryTest() {
    }

    @Test
    public void createStudentAccomodation() {
        
        repos = ctx.getBean(StudentAccomodationRepository.class);
        StudentAccomodation sa = new StudentAccomodation.Builder()
                                                        .name("Catsville")
                                                        .people("single-room")
                                                        .price(23000)
                                                        .build();
        
        repos.save(sa);
        id = sa.getId();
      
     
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
