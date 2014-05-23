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
public class AccomodationFeatures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int     nights;
    private String  suites;
    
    private AccomodationFeatures()
    {
        
    }

    private AccomodationFeatures(Builder builder) {
        
        id = builder.id;
        nights = builder.nights;
        suites = builder.suites;
       
    }
    
    public static class Builder
    {
        private Long id;
        private int     nights;
        private String  suites;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder nights(int value)
        {
            nights = value;
             return this;
        }
        public Builder suites(String value)
        {
            suites = value;
             return this;
        }
        public Builder accomodationFeatures(AccomodationFeatures a)
        {
            id     = a.getId();
            nights = a.getNights();
            suites = a.getSuites();
            return this;
        }
        
        public AccomodationFeatures build()
        {
            return new AccomodationFeatures(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNights() {
        return nights;
    }

    public String getSuites() {
        return suites;
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
        if (!(object instanceof AccomodationFeatures)) {
            return false;
        }
        AccomodationFeatures other = (AccomodationFeatures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.AccomodationFeatures[ id=" + id + " ]";
    }
    
}
