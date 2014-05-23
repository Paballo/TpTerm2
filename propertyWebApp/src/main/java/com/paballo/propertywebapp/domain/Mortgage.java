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
public class Mortgage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double price;
    private double interestRate;
    private int years;
    
    private Mortgage()
    {
        
    }

    private Mortgage(Builder aThis) {
        
        id = aThis.id;
        price = aThis.price;
        interestRate = aThis.interestRate;
        years = aThis.years;
       
    }
    
    public static class Builder
    {
        private Long id;
        private double price;
        private double interestRate;
        private int years;
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder price(double value)
        {
            price = value;
            return this;
        }
        public Builder interestRate(double value)
        {
            interestRate = value;
            return this;
        }
        public Builder years(int value)
        {
            years = value;
            return this;
        }
        public Builder Mortgage(Mortgage mortage)
        {
            id = mortage.getId();
            price = mortage.getPrice();
            interestRate = mortage.getInterestRate();
            years = mortage.getYears();
            return this;
        }
        public Mortgage build()
        {
            return new Mortgage(this);
        }
        
        
    }
            

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getPrice() {
        return price;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getYears() {
        return years;
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
        if (!(object instanceof Mortgage)) {
            return false;
        }
        Mortgage other = (Mortgage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Mortgage[ id=" + id + " ]";
    }
    
}
