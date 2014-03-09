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
public final  class UserBuying implements User{
    
    private boolean family;

    private UserBuying(Builder b) {
        this.family = b.family;
    }
    
    public static class Builder
    {
        private boolean family;
        
        public Builder(boolean family)
        {
            this.family = family;
        }
        
        public Builder userBuying(boolean family)
        {
            this.family = family;
            return this;
        }
        
        public UserBuying userBuying()
        {
            return new UserBuying(this);
        }
    }

    @Override
    public String name(String name) {
        return name;
    }

    public boolean isFamily() {
        return family;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.family ? 1 : 0);
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
        final UserBuying other = (UserBuying) obj;
        if (this.family != other.family) {
            return false;
        }
        return true;
    }
    
}
