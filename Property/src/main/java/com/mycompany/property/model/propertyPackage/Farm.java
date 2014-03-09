/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.propertyPackage;

import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class Farm implements Property{
    
    private String farmType;

    private Farm(Builder b) {
        farmType = b.farmType;
    }
    
    public static class Builder
    {
        private String farmType;
        
        public Builder (String farmType)
        {
            this.farmType = farmType;
        }
        
        public Builder farmtype(String farmType)
        {
            this.farmType = farmType;
            return this;
        }
        
        public Farm farm()
        {
            return new Farm(this);
        }
    }
    
    @Override
    public double area() {
        return 0;
    }

    public String getFarmType() {
        return farmType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.farmType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Farm other = (Farm) obj;
        if (!Objects.equals(this.farmType, other.farmType)) {
            return false;
        }
        return true;
    }
    
    
}
