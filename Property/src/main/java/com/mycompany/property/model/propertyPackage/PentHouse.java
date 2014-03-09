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
public final class PentHouse implements Property{
    
    private String building;

    private PentHouse(Builder b) {
        this.building = b.building;
    }
    
    public static class Builder
    {
        private String building;
        
        public Builder(String building)
        {
            this.building = building;
        }
        
        public Builder pentHouses(String building)
        {
            this.building = building;
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
            

    @Override
    public double area() {
        return 0;
    }
    
}
