/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.structural.adapter;

/**
 *
 * @author donkey
 */
public class TemperatureObjectReporter implements TemperatureInfo{
    
    CelciusReporter celciusReporter;

    
    public TemperatureObjectReporter()
    {
        celciusReporter = new CelciusReporter();
    }
    
    @Override
    public double getTemperatureInC() {
        return  celciusReporter.getTemperature();
    }
    @Override
    public double getTemperatureInF() {
        return cToF(celciusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperature(temperatureInC);
        
    }
    
    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperature(fToC(temperatureInF));
        
    }
    
    private double fToC(double f)
    {
        return ((f - 32) * 5/9);
    }
    
    private double cToF(double c)
    {
        return ((c * 9 / 5) + 32);
    }

    

    
    
    
}
