/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.userPackage.Impl;

/**
 *
 * @author donkey
 */
public final class Bond {
    
    private int years;

    private Bond(Builder b) {
        this.years = b.years;
    }
    
    public static class Builder
    {
        private int years;
        
        public Builder(int years)
        {
            this.years = years;
        }
        
        public Builder bond(int years)
        {
            this.years = years;
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
    
}
