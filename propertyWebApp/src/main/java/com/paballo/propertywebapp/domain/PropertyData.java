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
public class PropertyData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int     rooms;
    private int     bedrooms;
    private int     garages;
    
    private PropertyData()
    {
        
    }

    private PropertyData(Builder aThis) {
       
        id = aThis.id;
        rooms = aThis.rooms;
        bedrooms = aThis.bedrooms;
        garages = aThis.garages;
    }
    
    public static class Builder
    {
        private Long id;
        private int     rooms;
        private int     bedrooms;
        private int     garages;
        
        public Builder()
        {
            
        }
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder rooms(int value)
        {
            rooms = value;
            return this;
        }
        public Builder bedrooms(int value)
        {
            bedrooms = value;
            return this;
        }
        public Builder garages(int value)
        {
            garages = value;
            return this;
        }
        public Builder PropertyData(PropertyData propertyData)
        {
            id = propertyData.getId();
            rooms = propertyData.getRooms();
            bedrooms = propertyData.getBedrooms();
            garages  = propertyData.getGarages();
            return this;
        }
        
        public PropertyData build()
        {
            return new PropertyData(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getGarages() {
        return garages;
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
        if (!(object instanceof PropertyData)) {
            return false;
        }
        PropertyData other = (PropertyData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.PropertyData[ id=" + id + " ]";
    }
    
}
