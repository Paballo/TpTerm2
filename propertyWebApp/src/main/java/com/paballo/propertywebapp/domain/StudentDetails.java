/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author donkey
 */
@Entity
public class StudentDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String studentNumber;
    private String medicalAid;
    private String vihicle;
    
    private StudentDetails()
    {
        
    }

    private StudentDetails(Builder aThis) {
        id = aThis.id;
        studentNumber = aThis.studentNumber;
        medicalAid = aThis.medicalAid;
        vihicle = aThis.vihicle;
    }
    
    public static class Builder
    {
        private Long id;
        private String studentNumber;
        private String medicalAid;
        private String vihicle;
        
        public Builder()
        {
            
        }
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder studentNumber(String value)
        {
            studentNumber = value;
            return this;
        }
        public Builder medicalAid(String value)
        {
            medicalAid = value;
            return this;
        }
        public Builder(String value)
        {
            
        }
        public Builder vihicle(String value)
        {
            vihicle = value;
            return this;
        }
        public Builder StudetDetails(StudentDetails studetDetails)
        {
            id = studetDetails.getId();
            studentNumber = studetDetails.getStudentNumber();
            medicalAid = studetDetails.getMedicalAid();
            vihicle = studetDetails.getVihicle();
            
            return this;
        }
        public StudentDetails build()
        {
            return new StudentDetails(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getMedicalAid() {
        return medicalAid;
    }

    public String getVihicle() {
        return vihicle;
    }
    

    
    
    public Long getId() {
        return id;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentDetails)) {
            return false;
        }
        StudentDetails other = (StudentDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.StudentDetails[ id=" + id + " ]";
    }
    
}
