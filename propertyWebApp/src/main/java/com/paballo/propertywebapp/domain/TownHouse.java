/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author donkey
 */
@Embeddable
public class TownHouse {
    
    private int garage;
    

    private TownHouse(Builder b) {
        
        garage = b.garage;
        
       
    }
    
    public static class Builder
    {
        private int garage;
        
        
        public Builder(int garage)
        {
            this.garage = garage;
        }
        
        public Builder townHouse(int garage)
        {
            this.garage = garage;
            return this;
        }
        public Builder townHouse(String id)
        {
            
            return this;
        }
        
        public TownHouse townHouse()
        {
            return new TownHouse(this);
        }
    }

    public int getGarage() {
        return garage;
    }
    
}
