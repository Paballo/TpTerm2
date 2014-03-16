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
public final class Studio {
    
    private double area;
private String id;
    private Studio(Builder b) {
        
        area = b.area;
        id = b.id;
    }
    
    public static class Builder
    {
        private double area;
        private String id;
        
        public Builder(double area,String id)
        {
            this.area = area;
            this.id = id;
        }
        
        public Builder studio(double area)
        {
            this.area = area;
            return this;
        }
        
        public Builder studio(String id)
        {
            this.id = id;
            return this;
        }
        public Studio studio()
        {
            return new Studio(this);
        }
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
