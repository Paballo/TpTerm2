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
public class Commune {
    
     private int maximumCommuners;
    

    private Commune(Builder b) {
        
        maximumCommuners = b.maximumCommuners;
        
    }
    
    public static class Builder
    {
        private int maximumCommuners;
       
        
        public Builder(int maxCommuners,String id)
        {
            maximumCommuners = maxCommuners;
            
        }
        
        public Builder communers(int communers)
        {
            maximumCommuners = communers;
            return this;
        }
         public Builder communers(String id)
        {
            
            return this;
        }
        
        public Commune build()
        {
            return new Commune(this);
        }
    }
    
}
