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
public class Accomodation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String type;
   // private List<Location> location;
    private double price;
    
    private Accomodation()
    {
        
    }
    
    private Accomodation(Builder builder)
    {
        name    = builder.name;
        type    = builder.type;        
        price   = builder.price;
    }
    
    public static class Builder{
        
        private Long   id;
        private String name;
        private String type;
        private double price;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id  = value;
            return this;
        }
        public Builder name(String value)
        {
            name = value;
            return this;
        }
        public Builder type(String value)
        {
            type = value;
            return this;
        }
        
        public Builder price(double value)
        {
            price = value;
            return this;
        }
        
        public Builder Accomodation(Accomodation accomodation)
        {   
            id      = accomodation.getId();
            name    = accomodation.getName();
            type    = accomodation.getType();
            price   = accomodation.getPrice();
            
            return this;
        }
        
        public Accomodation build()
        {
            return new Accomodation(this);
        }
        
        
        
    }
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getType() {
        return type;
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
        if (!(object instanceof Accomodation)) {
            return false;
        }
        Accomodation other = (Accomodation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Accomodation[ id=" + id + " ]";
    }
    
}
