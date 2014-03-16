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
public final class Commune {
    
    
    private int maximumCommuners;
    private String id;

    private Commune(Builder b) {
        
        maximumCommuners = b.maximumCommuners;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private int maximumCommuners;
        private String id;
        
        public Builder(int maxCommuners,String id)
        {
            maximumCommuners = maxCommuners;
            this.id = id;
        }
        
        public Builder communers(int communers)
        {
            maximumCommuners = communers;
            return this;
        }
         public Builder communers(String id)
        {
            this.id = id;
            return this;
        }
        
        public Commune build()
        {
            return new Commune(this);
        }
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

    public String getId() {
        return id;
    }
    
    
}
