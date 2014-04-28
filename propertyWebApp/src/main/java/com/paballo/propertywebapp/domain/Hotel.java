/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author donkey
 */
@Embeddable
public class Hotel {
    
    private int starRating;
    

    private Hotel(Builder b) {
        this.starRating = b.starRating;
        
    }
    
    public static class Builder
    {
        private int starRating;
        
        
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

    
    
}
