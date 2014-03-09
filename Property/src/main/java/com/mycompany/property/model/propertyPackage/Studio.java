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
public final class Studio implements Property{
    
    private double area;

    private Studio(Builder b) {
        
        area = b.area;
    }
    
    public static class Builder
    {
        private double area;
        
        public Builder(double area)
        {
            this.area = area;
        }
        
        public Builder studio(double area)
        {
            this.area = area;
            return this;
        }
        
        public Studio studio()
        {
            return new Studio(this);
        }
    }

    @Override
    public double area() {
        return 0;
    }

    public double getArea() {
        return area;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
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
        final Studio other = (Studio) obj;
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        return true;
    }
    
    
}
