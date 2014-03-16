/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model;

/**
 *
 * @author donkey
 */
public final class Building {
    
    private int floors;
    private double height;
    private String id;
    
    private Building(Builder b)
    {
        floors = b.floors;
        height = b.height;
        id     = b.id;
    }

    public static class Builder{
        
        private int floors;
        private double height;
        private String id;

        public Builder(int floors, double height,String id) {
            this.floors = floors;
            this.height = height;
            this.id     = id;
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
        public Builder id(String id)
        {
            this.id = id;
            return this;
        }
        
        public Building build()
        {
            return new Building(this);
        }
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

    public String getId() {
        return id;
    }
    
    
    
}
