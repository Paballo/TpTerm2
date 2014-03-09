/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.locationPackage;

/**
 *
 * @author donkey
 */
public final class AreaStats {
    
    private int averageWeather;

    private AreaStats(Builder b) {
        
        this.averageWeather = b.averageWeather;
        
    }
    
    public static class Builder
    {
        private int averageWeather;
        
        public Builder(int averageWeather)
        {
            this.averageWeather = averageWeather;
        }
        
        public Builder areaStats(int averageWeather)
        {
            this.averageWeather = averageWeather;
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
