/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model;


import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class BackPackers {
    
    private String name;
    private String id;

    private BackPackers(Builder b) {
       this.name = b.name;
       this.id   = b.id;
    }
    
    public static class Builder{
        private String name;
        private String id;
        
        public Builder(String name,String id)
        {
            this.name = name;
            this.id   = id;
        }
        
        public Builder backpacker(String name)
        {
            this.name = name;
            return this;
        }
        public Builder getId(String id)
        {
            this.id = id;
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

    public String getId() {
        return id;
    }
    
    
}
