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
public class StudentAccomFeature implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean parking;
    private String  catering;
    private boolean laundry;
    
    private StudentAccomFeature()
    {
        
    }

    private StudentAccomFeature(Builder builder) {
        
        id = builder.id;
        parking = builder.parking;
        catering = builder.catering;
        laundry = builder.laundry;
        
    }
    
    public static class Builder
    {
        private Long id;
        private boolean parking;
        private String  catering;
        private boolean laundry;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder parking(boolean value)
        {
            parking = value;
            return this;
        }
        public Builder catering(String value)
        {
            catering = value;
            return this;
        }
        public Builder laundry(boolean value)
        {
            laundry = value;
            return this;
        }
        public Builder StudentAccomFeature(StudentAccomFeature st)
        {
            id = st.getId();
            parking = st.isParking();
            catering = st.getCatering();
            laundry  = st.isLaundry();
            
            return this;
        }
        public StudentAccomFeature build()
        {
            return new StudentAccomFeature(this);
        }
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isParking() {
        return parking;
    }

    public String getCatering() {
        return catering;
    }

    public boolean isLaundry() {
        return laundry;
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
        if (!(object instanceof StudentAccomFeature)) {
            return false;
        }
        StudentAccomFeature other = (StudentAccomFeature) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.StudentAccomFeature[ id=" + id + " ]";
    }
    
}
