/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accomodationTests;

import com.mycompany.property.app.appConfiguration;
import com.mycompany.property.model.accomodationPackage.Impl.Hotel;
import com.mycompany.property.model.accomodationPackage.Impl.StudentAccomodation;
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
public class StudentAccomodationTest {
    
    private static StudentAccomodation.Builder studentAccomodation;
    
    public StudentAccomodationTest() {
    }

    @Test
    public void studentAccomodationTests() {
    studentAccomodation.studentAccomodation("cput").studentAccomodation();
    Assert.assertEquals(studentAccomodation.studentAccomodation().getInstitution(), "cput");
    }
    @Test
    public void studentAccomodation2Tests() {
    studentAccomodation.studentAccomodation("uct").studentAccomodation();
    Assert.assertEquals(studentAccomodation.studentAccomodation().getInstitution(), "uct");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfiguration.class);
        studentAccomodation = (StudentAccomodation.Builder)ctx.getBean("studentaccomodation");
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
