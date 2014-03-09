/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.propertyPackage;

/**
 *
 * @author donkey
 */
public final class TownHouse implements Property{
    
    private int garage;

    private TownHouse(Builder b) {
        
        garage = b.garage;
       
    }
    
    public static class Builder
    {
        private int garage;
        
        public Builder(int garage)
        {
            this.garage = garage;
        }
        
        public Builder townHouse(int garage)
        {
            this.garage = garage;
            return this;
        }
        
        public TownHouse townHouse()
        {
            return new TownHouse(this);
        }
    }
            

    @Override
    public double area() {
        return 0;
    }

    public int getGarage() {
        return garage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.garage;
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
        final TownHouse other = (TownHouse) obj;
        if (this.garage != other.garage) {
            return false;
        }
        return true;
    }
    
}
