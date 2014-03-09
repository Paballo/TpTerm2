/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.userPackage.Impl;

import java.util.Objects;

/**
 *
 * @author donkey
 */
public  final class Ratings {
    
    private String discription;

    private Ratings(Builder b) {
        
        this.discription = b.discription;
        
    }

    public Ratings() {
        
    }
    
    public class Builder
    {
        private String discription;
        
        public Builder(String discription)
        {
            this.discription = discription;
        }
        public Builder ratings(String discription)
        {
             this.discription = discription;
             return this;
        }
        
        public Ratings ratings()
        {
            return new Ratings(this);
        }
    }

    public String getDiscription() {
        return discription;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.discription);
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
        final Ratings other = (Ratings) obj;
        if (!Objects.equals(this.discription, other.discription)) {
            return false;
        }
        return true;
    }
    
}
