/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.userPackage.Impl;

/**
 *
 * @author donkey
 */
public  final class Buying {
    
    private double price;

    private Buying(Builder b) {
        this.price = b.price;
    }
    
    public static class Builder
    {
        private double price;
        
        public Builder(double price)
        {
            this.price = price;
        }
        
        public Builder buying(double price)
        {
            this.price = price;
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
