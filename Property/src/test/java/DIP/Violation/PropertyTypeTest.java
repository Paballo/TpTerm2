/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DIP.Violation;

import Property.Config.PropertyConfig;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyCommune;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyStudio;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyTownHouse;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyType;
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
public class PropertyTypeTest {
    
    PropertyType propertyType;
    PropertyTownHouse propertyTownHouse;
    PropertyCommune propertyCommune;
    PropertyStudio propertyStudio;
    
    public PropertyTypeTest() {
    }

    //There are different types of properties like :  a Studio
    //There are different types of properties like :  a commune
   // There are different types of properties like :  a Town House
   
    //There are different types of properties like : 
    
    @Test
    public void propertyTestType() {
        String sentence  = propertyType.discription();
        Assert.assertEquals(sentence, "There are different types of properties like : ");
    }
     @Test
    public void propertyTestTownHouse() {
        String townHouse = propertyTownHouse.townHouse();         
        Assert.assertEquals(townHouse,"There are different types of properties like :  a Town House");
    }
    
    @Test
    public void propertyCommune()
    {
        String commune = propertyCommune.commune();
        Assert.assertEquals(commune,"There are different types of properties like :  a commune");
    }
    @Test
    public void propertyStudio()
    {
        String studio = propertyStudio.studio();
        Assert.assertEquals(studio, "There are different types of properties like :  a Studio");
    }
    

    @BeforeClass
    public  void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        propertyType = (PropertyType)ctx.getBean("DIP1");
       propertyTownHouse = (PropertyTownHouse)ctx.getBean("DIP2");
       propertyCommune    = (PropertyCommune)ctx.getBean("DIP3");
       propertyStudio     = (PropertyStudio)ctx.getBean("DIP4");
        
       
       
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
