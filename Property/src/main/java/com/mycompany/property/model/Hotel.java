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
public final class Hotel {
    
    private int starRating;
    private String id;

    private Hotel(Builder b) {
        this.starRating = b.starRating;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private int starRating;
        private String id;
        
        public Builder(int starRating)
        {
            this.starRating = starRating;
        }
        
        public Builder hotel(int starRating)
        {
            this.starRating = starRating;
            return this;
        }
        public Builder hotel(String id)
        {
            this.id = id;
            return this;
        }
        public Hotel hotel()
        {
            return new Hotel(this);
        }
                
    }


    public int getStarRating() {
        return starRating;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.starRating;
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
        final Hotel other = (Hotel) obj;
        if (this.starRating != other.starRating) {
            return false;
        }
        return true;
    }
    
}
