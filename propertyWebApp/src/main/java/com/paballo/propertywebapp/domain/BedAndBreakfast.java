/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import java.util.logging.Logger;
import javax.persistence.Embeddable;

/**
 *
 * @author donkey
 */
@Embeddable
public class BedAndBreakfast {
    
    private boolean selfServing;
    private int rooms;
    
    

    private BedAndBreakfast(Builder b) {
        selfServing = b.selfServing;
        
    }
    
    public static class Builder
    {
        private boolean selfServing;
        
        private int rooms;
        
        public Builder(int rooms)
        {
            this.rooms = rooms;
        }
        
        
        public Builder(boolean selfServing)
        {
            this.selfServing = selfServing;
        }
        public Builder bedAndBreakfast(boolean selfServing)
        {
            this.selfServing = selfServing;
            return this;
        }
        public BedAndBreakfast bedAndBreakfast()
        {
            return new BedAndBreakfast(this);
        }
    }

    public void setSelfServing(boolean selfServing) {
        this.selfServing = selfServing;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    
}
