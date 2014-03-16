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
public final class Land {
    
    private String terrain;
    private String id;

    private Land(Builder b) {
        
       terrain = b.terrain;
       this.id  = b.id;
    }

    public static class Builder
    {
        private String terrain;
        private String id;
        
        public Builder(String terrain,String id)
        {
                this.terrain = terrain;
                this.id = id;
        }
        
        public Builder land(String terrain)
        {
            this.terrain = terrain;
            return this;
        }
        public Builder land2(String id)
        {
            this.id = id;
            return this;
        }
        
        public Land land()
        {
            return new Land(this);
        }
    }
    
   

    public String getTerrain() {
        return terrain;
    }

    public String getId() {
        return id;
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
