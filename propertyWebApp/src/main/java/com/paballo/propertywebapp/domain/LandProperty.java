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
public class LandProperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private double area;
    private double price;

    //List<Location>
    private LandProperty()
    {
        
    }

    private LandProperty(Builder builder ){
        
        id    = builder.id;
        type  = builder.type;
        area  = builder.area;
        price = builder.price;
        
    }
    
    public static class Builder
    {
        private Long id;
        private String type;
        private double area;
        private double price;
        
        public Builder()
        {
            
        }
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder type(String value)
        {
            type = value;
            return this;
        }
        public Builder area(double value)
        {
            area = value;
            return this;
        }
        public Builder price(double value)
        {
            price = value;
            return this;
        }
        
        public Builder landProperty(LandProperty landProperty)
        {
            id    = landProperty.getId();
            type  = landProperty.getType();
            area  = landProperty.getArea();
            price = landProperty.getPrice();
            
            return this;
        }
        
        public LandProperty build()
        {
            return new LandProperty(this);
        }
    }
    
    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
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
        if (!(object instanceof LandProperty)) {
            return false;
        }
        LandProperty other = (LandProperty) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.LandProperty[ id=" + id + " ]";
    }
    
}
