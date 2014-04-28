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
public class Estate {
    
    private String style;
    

    private Estate(Builder b) {
        
        this.style = b.style;
        
        
    }

    
     
    public static class Builder
    {
        private String style;
        
        
        public Builder(String style,String id)
        {
            this.style = style;
        }
        
        public Builder golfEstates(String style)
        {
            this.style = style;
            return this;
        }
         public Builder golfEstates2(String id)
        {
            
            return this;
        }
        
        public Estate golfEstate()
        {
            return new Estate(this);
        }
        
    }
    
   

    public String getStyle() {
        return style;
    }
    
}
