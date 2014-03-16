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
public final  class UserSelling {

    private double price;
    private String id;

    private UserSelling(Builder b) {
        price = b.price;
        id = b.id;
        
    }
    
    public static class Builder
    {
        private double price;
        private String id;
        
        public Builder(double price,String id)
        {
            this.price = price;
            this.id = id;
        }
        
        public Builder userSelling(double price)
        {
            this.price = price;
            return this;
        }
        public Builder userSelling(String id)
        {
            this.id = id;
            return this;
        }
        
        public UserSelling userSelling()
        {
            return new UserSelling(this);
        }
    }

    public String getId() {
        return id;
    }
    
   

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final UserSelling other = (UserSelling) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return true;
    }
    
    
}
