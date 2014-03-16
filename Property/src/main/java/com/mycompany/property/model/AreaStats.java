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
public final class AreaStats {
    
    private int averageWeather;
    private String id;

    private AreaStats(Builder b) {
        
        this.averageWeather = b.averageWeather;
        this.id             = b.id;
        
    }
    
    public static class Builder
    {
        private int averageWeather;
        private String id;
        
        public Builder(int averageWeather,String id)
        {
            this.averageWeather = averageWeather;
            this.id = id;
        }
        
        public Builder areaStats(int averageWeather)
        {
            this.averageWeather = averageWeather;
            return this;
        }
        public Builder ID(String id)
        {
            this.id = id;
            return this;
        }
        
        public AreaStats areaStats()
        {
            return new AreaStats(this);
        }
    }

    public int getAverageWeather() {
        return averageWeather;
    }

    public String getId() {
        return id;
    }
      
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.averageWeather;
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
        final AreaStats other = (AreaStats) obj;
        if (this.averageWeather != other.averageWeather) {
            return false;
        }
        return true;
    }
    
}
