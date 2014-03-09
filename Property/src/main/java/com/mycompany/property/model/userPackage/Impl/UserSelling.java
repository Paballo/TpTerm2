/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.userPackage.Impl;

import com.mycompany.property.model.userPackage.User;

/**
 *
 * @author donkey
 */
public final  class UserSelling implements User {

    private double price;

    private UserSelling(Builder aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static class Builder
    {
        private double price;
        
        public Builder(double price)
        {
            this.price = price;
        }
        
        public Builder userSelling(double price)
        {
            this.price = price;
            return this;
        }
        
        public UserSelling userSelling()
        {
            return new UserSelling(this);
        }
    }
    
    @Override
    public String name(String name) {
        return name;
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
