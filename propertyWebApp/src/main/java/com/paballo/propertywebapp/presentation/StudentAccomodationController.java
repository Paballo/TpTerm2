/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.presentation;

import com.paballo.propertywebapp.domain.StudentAccomodation;
import com.paballo.propertywebapp.services.StudentAccomodationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author donkey
 */
@Controller

public class StudentAccomodationController {
    
    @Autowired
    private StudentAccomodationService studentAccomodationService;
    
    @RequestMapping(value = "studentAccomodation")
    @ResponseBody
    public StudentAccomodation getStudentAccomodation()
    {
        StudentAccomodation studentAccomodation = null ;
        List<StudentAccomodation> studentAccomodations = studentAccomodationService.getTotalAccomodation();
        System.out.println("The collection size " + studentAccomodations.size());
        
        if(studentAccomodations.size() > 0)
        {
            studentAccomodation = studentAccomodations.get(0);
        }
        return studentAccomodation;
    }
    
    @RequestMapping(value = "studentAccomodations")
    @ResponseBody
    public List<StudentAccomodation> getStudentAccomodations()
    {
        return studentAccomodationService.getTotalAccomodation();
    }
    
}
