/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.Config;

import Property.DesignPrinciples.DIP.NonViolation.Service.Impl.PropertyHouse;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyCommune;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyStudio;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyTownHouse;
import Property.DesignPrinciples.DIP.Violation.Service.PropertyType;
import Property.DesignPrinciples.ISP.NonViolation.Service.FlatInterface;
import Property.DesignPrinciples.ISP.NonViolation.Service.Impl.FlatClass;
import Property.DesignPrinciples.ISP.NonViolation.Service.Impl.PlaneClass;
import Property.DesignPrinciples.ISP.NonViolation.Service.PlaneInterface;
import Property.DesignPrinciples.ISP.Violation.Service.Flat;
import Property.DesignPrinciples.ISP.Violation.Service.Plane;
import Property.DesignPrinciples.LSP.NonViolation.Service.Impl.HouseRectangle;
import Property.DesignPrinciples.LSP.NonViolation.Service.Impl.HouseSquare;
import Property.DesignPrinciples.LSP.NonViolation.Service.RectangleInterface;
import Property.DesignPrinciples.LSP.NonViolation.Service.SquareInterface;
import Property.DesignPrinciples.LSP.Violation.Service.HouseRectangleShape;
import Property.DesignPrinciples.LSP.Violation.Service.HouseSquareShape;
import Property.DesignPrinciples.OCP.NonViolation.Service.Impl.PropertyRent2;
import Property.DesignPrinciples.OCP.Violation.Service.Impl.PropertyRent;
import Property.DesignPrinciples.OCP.Violation.Service.PropertyRentInterface;
import Property.DesignPrinciples.SRP.NonViolation.Service.HouseSizeClass;
import Property.DesignPrinciples.SRP.Violation.Service.HouseSize;
import Property.Encapsulation.Apartment;
import Property.Encapsulation.ApartmentApplication;
import Property.Inheritence.Mansion;
import Property.Polymorphism.HouseTypeAll;
import Property.Polymorphism.Impl.DogHouse;
import Property.Polymorphism.Impl.Shack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author donkey
 */
@Configuration
public class PropertyConfig {
    
    @Bean(name="OCP1")
    public PropertyRentInterface getRent()
    {
    
        return new PropertyRent();
    }
    @Bean(name="OCP2")
    public PropertyRent2 getRent2()
    {
    
        return new PropertyRent2();
    }
    @Bean(name="DIP1")
    public PropertyType getType()
    {
        return new PropertyType();
    }
    
    @Bean(name="DIP2")
    public PropertyTownHouse getHouse()
    {
        return new PropertyTownHouse(); 
    }
    
    @Bean(name="DIP3")
    public PropertyCommune getCommune()
    {
        return new PropertyCommune();
    }
    
    @Bean(name="DIP4")
    public PropertyStudio getStudio()
    {
        return new PropertyStudio();
    }
    @Bean(name="DIP5")
    public PropertyHouse getHouseType()
    {
        return new PropertyHouse();
    }
    @Bean(name="ISP1")
    public Flat getFlat()
    {
        return new Flat();
    }
    @Bean(name="ISP2")
    public Plane getPlane()
    {
        return new Plane();
    }
    
    @Bean(name="ISP3")
    public PlaneInterface getPlaneClass()
    {
        return new PlaneClass();
    }
    @Bean(name="ISP4")
    public FlatInterface getFlatClass()
    {
        return new FlatClass();
    }
    
    @Bean(name="LSP1")
    public HouseRectangleShape getRectangleShape()
    {
        return new HouseSquareShape();
    }
    
    @Bean(name="LSP2")
    public HouseRectangle getRectangle()
    {
        return new HouseRectangle();
    }
    @Bean(name="LSP3")
    public HouseSquare getSquare()
    {
        return new HouseSquare();
    }
    
    @Bean(name="SRP1")
    public HouseSize getHouseSize()
    {
        return new HouseSize();
    }
    @Bean(name = "SRP2")
    public HouseSizeClass getHouseSizeClass()
    {
        return new HouseSizeClass();
    }
    
    
    @Bean(name="Inherit")
    public Mansion getmansions()
    {
        return new Mansion();
    }
    @Bean(name="poly")
    public HouseTypeAll getHouseTypeAll()
    {
        return new DogHouse();
    }
     @Bean(name="poly2")
    public HouseTypeAll getHouseTypeAll2()
    {
        return new Shack();
    }
           
    
    
}
