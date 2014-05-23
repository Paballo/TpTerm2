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
public class AreaDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int     averageTemp;
    private int     lowestTemp;
    private int     highestTemp;
    private String  status;
    
    private AreaDetails()
    {
        
    }

    private AreaDetails(Builder builder) {
        
        id          = builder.id;
        averageTemp = builder.averageTemp;
        lowestTemp  = builder.lowestTemp;
        highestTemp = builder.highestTemp;
        status      = builder.status;
    }
    
    public static class Builder
    {
        private Long    id;
        private int     averageTemp;
        private int     lowestTemp;
        private int     highestTemp;
        private String  status;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder averageTemp(int value)
        {
            averageTemp = value;
            return this;
        }
        public Builder lowestTemp(int value)
        {
            lowestTemp = value;
            return this;
        }
        public Builder highestTemp(int value)
        {
            highestTemp = value;
            return this;
        }
        public Builder status(String value)
        {
            status = value;
            return this;
        }
        
        public Builder areaDetails(AreaDetails areaDetails)
        {
            id          = areaDetails.getId();
            averageTemp = areaDetails.getAverageTemp();
            lowestTemp  = areaDetails.getLowestTemp();
            highestTemp = areaDetails.getHighestTemp();
            status      = areaDetails.getStatus();
            return this;
        }
        
        public AreaDetails build()
        {
            return new AreaDetails(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public int getLowestTemp() {
        return lowestTemp;
    }

    public int getHighestTemp() {
        return highestTemp;
    }

    public String getStatus() {
        return status;
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
        if (!(object instanceof AreaDetails)) {
            return false;
        }
        AreaDetails other = (AreaDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.AreaDetails[ id=" + id + " ]";
    }
    
}
