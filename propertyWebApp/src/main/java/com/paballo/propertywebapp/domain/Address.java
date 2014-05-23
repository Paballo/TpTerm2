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
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String area;
    private String areaCode;
    
    private Address()
    {
        
    }

    private Address(Builder aThis) {
        
        id = aThis.id;
        street = aThis.street;
        area = aThis.area;
        areaCode = aThis.areaCode;
        
        
    }
    
    public static class Builder
    {
        private Long id;
        private String street;
        private String area;
        private String areaCode;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder street(String value)
        {
            street = value;
            return this;
        }
        public Builder area(String value)
        {
            area = value;
            return this;
        }
        public Builder areaCode(String value)
        {
            areaCode = value;
            return this;
        }
        public Builder Address(Address address)
        {
            id = address.getId();
            street = address.getStreet();
            area = address.getArea();
            areaCode = address.getAreaCode();
            return this;
        }
        public Address build()
        {
            return new Address(this);
        }
                
                
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getAreaCode() {
        return areaCode;
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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Address[ id=" + id + " ]";
    }
    
}
