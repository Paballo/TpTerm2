/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model;

import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class Farm {
    
    private String farmType;
    private String id;

    private Farm(Builder b) {
        farmType = b.farmType;
         this.id = b.id;
    }
    
    public static class Builder
    {
        private String farmType;
        private String id;
        
        public Builder (String farmType,String id)
        {
            this.farmType = farmType;
            this.id = id;
        }
        
        public Builder farmtype(String farmType)
        {
            this.farmType = farmType;
            return this;
        }
        public Builder farmtype2(String id)
        {
             this.id = id;
            return this;
        }
        
        
        public Farm farm()
        {
            return new Farm(this);
        }
    }
    
    
  

    public String getFarmType() {
        return farmType;
    }

    public String getId() {
        return id;
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
