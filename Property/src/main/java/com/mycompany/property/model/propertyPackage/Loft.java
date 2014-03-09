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
public final class Loft implements Property{
    
    private double rooms;

    private Loft(Builder b) {
        
        rooms = b.rooms;
        
    }
    
    public static class Builder
    {
        private double rooms;
        
        public Builder(double rooms)
        {
            this.rooms = rooms;
        }
        public Builder loft(double rooms)
        {
            this.rooms = rooms;
            return this;
        }
        
        public Loft loft()
        {
            return new Loft(this);
        }
    }

    @Override
    public double area() {
        return 0;
    }

    public double getRooms() {
        return rooms;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.rooms) ^ (Double.doubleToLongBits(this.rooms) >>> 32));
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
        final Loft other = (Loft) obj;
        if (Double.doubleToLongBits(this.rooms) != Double.doubleToLongBits(other.rooms)) {
            return false;
        }
        return true;
    }
    
    
}
