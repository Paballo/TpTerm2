/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.repository;

import com.paballo.propertywebapp.app.conf.ConnectionConfig;
import com.paballo.propertywebapp.domain.User;
import com.paballo.propertywebapp.repository.UserRepository;
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
public class UserRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    
    private UserRepositoryTest repo;
    
    public UserRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createUser() {
        
       repo = ctx.getBean(UserRepositoryTest.class);
        User u = new User.Builder("paballolephatsoe@gmail.com")
                         .name("P")
                         .lastname("L")
                         .build();
        repo.save(u);
        id = u.getId();
        Assert.assertNotNull(u);
    }
    
   /* @Test(dependsOnMethods = "createUser")
    public void readUser() {
       repo = (UserRepositoryTest) ctx.getBean(UserRepository.class);
        User user = repo.findOne(id);
        Assert.assertEquals(user.getName(), "P");
    }
    
    @Test(dependsOnMethods = "readUser")
    public void updateUser() {
        repo = (UserRepositoryTest) ctx.getBean(UserRepository.class);
        User user = repo.findOne(id);
        User updatedUser = new User.Builder("paballolephatsoe@gmail.com")
                                   .user(user)
                                   .name("Paballo")
                                   .build();
        
        repo.save(updatedUser);
        
        User newUser = repo.findOne(id);
        Assert.assertEquals(newUser.getName(), "Paballo");
    }
*/
    @BeforeClass
    public  void setUpClass() throws Exception {
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
        repo = ctx.getBean(UserRepositoryTest.class);
        repo.deleteAll();
    }

    private void save(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private User findOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
