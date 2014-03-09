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
public final class Building implements Property {
    
    private int floors;
    private double height;
    
    private Building(Builder b)
    {
        floors = b.floors;
        height = b.height;
    }

    public static class Builder{
        
        private int floors;
        private double height;

        public Builder(int floors, double height) {
            this.floors = floors;
            this.height = height;
        }
        
        public Builder floors(int floor)
        {  
            floors = floor;
            
            return this;
        }
        public Builder height(double h)
        {
            height = h;
            return this;
        }
        
        public Building build()
        {
            return new Building(this);
        }
    }
    
    @Override
    public double area() {
        
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.floors;
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
        final Building other = (Building) obj;
        if (this.floors != other.floors) {
            return false;
        }
        return true;
    }

    public int getFloors() {
        return floors;
    }

    public double getHeight() {
        return height;
    }
    
    
    
}
