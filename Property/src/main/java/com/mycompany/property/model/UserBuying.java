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
public final  class UserBuying {
    
    private boolean family;
    private String id;

    private UserBuying(Builder b) {
        this.family = b.family;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private boolean family;
        private String id;
        
        public Builder(boolean family,String id)
        {
            this.family = family;
            this.id = id;
        }
        
        public Builder userBuying(boolean family)
        {
            this.family = family;
            return this;
        }
        public Builder userBuying(String id)
        {
            this.id = id;
            return this;
        }
        
        public UserBuying userBuying()
        {
            return new UserBuying(this);
        }
    }

   

    public boolean isFamily() {
        return family;
    }

    public String getId() {
        return id;
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
