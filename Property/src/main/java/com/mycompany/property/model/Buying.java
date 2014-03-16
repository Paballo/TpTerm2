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
public  final class Buying {
    
    private double price;
    private String id;

    private Buying(Builder b) {
        this.price = b.price;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private double price;
        private String id;
        
        public Builder(double price,String id)
        {
            this.price = price;
            this.id    = id;
        }
        
        public Builder buying(double price)
        {
            this.price = price;
            return this;
        }
        
        public Builder buying2(String id)
        {
            this.id = id;
            return this;
        }
        
        public Buying buying()
        {
            return new Buying(this);
        }
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Buying other = (Buying) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return true;
    }
            
    
}
