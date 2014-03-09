/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.locationPackage;

import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class Location {
    
    private String city;

    private Location(Builder b) {
        this.city = b.city;
    }
    
    public static class Builder
    {
        private String city;
        
        public Builder(String city)
        {
            this.city = city;
        }
        
        public Builder location(String city)
        {
            this.city = city;
            return this;
        }
        
        public Location location()
        {
            return new Location(this);
        }
    }

    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.city);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return true;
    }
    
}
