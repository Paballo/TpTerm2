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
public final class PentHouse {
    
    private String building;
    private String id;

    private PentHouse(Builder b) {
        this.building = b.building;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private String building;
        private String id;
        
        public Builder(String building,String id)
        {
            this.building = building;
            this.id = id;
            
        }
        
        public Builder pentHouses(String building)
        {
            this.building = building;
            return this;
        }
        public Builder pentHouses2(String id)
        {
            this.id = id;
            return this;
        }
        
        public PentHouse pentHouse()
        {
            return new PentHouse(this);
        }
    }

    public String getBuilding() {
        return building;
    }

    public String getId() {
        return id;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.building);
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
        final PentHouse other = (PentHouse) obj;
        if (!Objects.equals(this.building, other.building)) {
            return false;
        }
        return true;
    }
            

 
    
}
