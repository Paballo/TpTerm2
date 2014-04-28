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
public class BackPackers {
    
    private String name;
    

    private BackPackers(Builder b) {
       this.name = b.name;
       
    }
    
    public static class Builder{
        private String name;
        
        
        public Builder(String name,String id)
        {
            this.name = name;
            
        }
        
        public Builder backpacker(String name)
        {
            this.name = name;
            return this;
        }
        
        public BackPackers backpacker()
        {
            return new BackPackers(this);
        }
    }

   
    public String getName() {
        return name;
    }
    
}
