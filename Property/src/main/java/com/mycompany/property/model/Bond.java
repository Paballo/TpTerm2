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
public final class Bond {
    
    private int years;
    private String id;

    private Bond(Builder b) {
        this.years = b.years;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private int years;
        private String id;
        
        public Builder(int years,String id)
        {
            this.years = years;
            this.id    = id;
        }
        
        public Builder bond(int years)
        {
            this.years = years;
           return this;
        }
        public Builder bond2(String id)
        {
           this.id    = id;
           return this;
        }
        
        public Bond bond()
        {
            return new Bond(this);
        }
    }

    public int getYears() {
        return years;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.years;
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
        final Bond other = (Bond) obj;
        if (this.years != other.years) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }
    
}
