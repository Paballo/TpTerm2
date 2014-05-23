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
public class Properties implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String  propertyType;
    private String  name;
   // private List<Location> location;
    private double  price;
    
    
    
    private Properties(Builder builder)
    {
        id           = builder.id;
        propertyType = builder.propertyType;
        name         = builder.name;
        price        = builder.price;
        
    }
    
    public Properties()
    {
        
    }
    
    public static class Builder
    {
        private Long   id;
        private String propertyType;
        private String name;
        private double price;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        
        public Builder propertyType(String value)
        {
            propertyType = value;
            return this;
        }
        public Builder name(String value)
        {
            name = value;
            return this;
        }
        public Builder price(double value)
        {
            price = value;
            return this;
        }
        
        public Builder properties(Properties properties)
        {
            id            = properties.getId();
            propertyType  = properties.getPropertyType();
            name          = properties.getName();
            price         = properties.getPrice();
            return this;
        }
        
        public Properties build()
        {
            return new Properties(this);
        }
        
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
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
        if (!(object instanceof Properties)) {
            return false;
        }
        Properties other = (Properties) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Property[ id=" + id + " ]";
    }
    
}
