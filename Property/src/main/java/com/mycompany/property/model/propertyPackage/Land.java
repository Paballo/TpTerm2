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
public final class Land implements Property {
    
    private String terrain;

    private Land(Builder b) {
        
       terrain = b.terrain;
    }

    public static class Builder
    {
        private String terrain;
        
        public Builder(String terrain)
        {
                this.terrain = terrain;
        }
        
        public Builder land(String terrain)
        {
            this.terrain = terrain;
            return this;
        }
        
        public Land land()
        {
            return new Land(this);
        }
    }
    
    @Override
    public double area() {
        return 0;
        
    }

    public String getTerrain() {
        return terrain;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.terrain);
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
        final Land other = (Land) obj;
        if (!Objects.equals(this.terrain, other.terrain)) {
            return false;
        }
        return true;
    }
    
    
}
