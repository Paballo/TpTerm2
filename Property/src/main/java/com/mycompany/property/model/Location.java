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
public final class Location {
    
    private String city;
    private String id;

    private Location(Builder b) {
        this.city = b.city;
        this.id = b.id;
    }
    
    public static class Builder
    {
        private String city;
        private String id;
        
        public Builder(String city, String id)
        {
            this.city = city;
            this.id = id;
        }
        
        public Builder location(String city)
        {
            this.city = city;
            return this;
        }
         public Builder location2(String id)
        {
            this.id = id;
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

    public String getId() {
        return id;
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
