/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.propertyPackage;

/**
 *
 * @author donkey
 */
public final class Commune implements Property{
    
    
    private int maximumCommuners;

    private Commune(Builder b) {
        
        maximumCommuners = b.maximumCommuners;
    }
    
    public static class Builder
    {
        private int maximumCommuners;
        
        public Builder(int maxCommuners)
        {
            maximumCommuners = maxCommuners;
        }
        
        public Builder communers(int communers)
        {
            maximumCommuners = communers;
            return this;
        }
        
        public Commune build()
        {
            return new Commune(this);
        }
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.maximumCommuners;
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
        final Commune other = (Commune) obj;
        if (this.maximumCommuners != other.maximumCommuners) {
            return false;
        }
        return true;
    }

    public int getMaximumCommuners() {
        return maximumCommuners;
    }
    
    
}
