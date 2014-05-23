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
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String school;
    private String year;
   

    private Student()
    {
        
    }

    private Student(Builder builder) {
        
        id     = builder.id;
        school = builder.school;
        year   = builder.year;
        
    }
    
    public static class Builder
    {
        private Long id;
        private String school;
        private String year;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id  = value;
            return this;
        }
        public Builder school(String value)
        {
            school = value;
            return this;
        }
        public Builder year(String value)
        {
            year = value;
            return this;
        }
        public Builder student(Student student)
        {
            id     =  student.getId();
            school =  student.getSchool();
            year   =  student.getYear();
            
            return this;
        }
        public Student Build()
        {
            return new Student(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSchool() {
        return school;
    }

    public String getYear() {
        return year;
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Student[ id=" + id + " ]";
    }
    
}
