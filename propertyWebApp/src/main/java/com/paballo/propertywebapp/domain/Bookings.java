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
public class Bookings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    
    private int    nights;
    private int    adults;
    private int    children;
    private double price;
    
    private Bookings(Builder booking) {
        
    }

    private static class Builder
    {
        private Long   id;
        private int    nights;
        private int    adults;
        private int    children;
        private double price;
        
        public Builder id(long value)
        {
            id = value;
            return this;
        }
        
        public Builder nights(int value)
        {
            nights = value;
            return this;
        }
        
        public Builder adults(int value)
        {
            adults = value;
            return this;
        }
        
        public Builder children(int value)
        {
            children = value;
            return this;
        }
        public Builder price(double value)
        {
            price = value;
            return this;
        }
        
        public Bookings booking()
        {
           return new Bookings(this);
        }

      
        
        
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setPrice(double price) {
        this.price = price;
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
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Bookings[ id=" + id + " ]";
    }
    
}
