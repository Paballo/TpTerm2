/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.accomodationPackage.Impl;

import com.mycompany.property.model.accomodationPackage.Accomodation;
import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class BackPackers implements Accomodation {
    
    private String name;

    private BackPackers(Builder b) {
       this.name = b.name;
    }
    
    public static class Builder{
        private String name;
        
        public Builder(String name)
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

    @Override
    public int nights(int nights) {
        return nights;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
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
        final BackPackers other = (BackPackers) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
