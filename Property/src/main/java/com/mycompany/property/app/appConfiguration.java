/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.app;

import com.mycompany.property.model.accomodationPackage.Impl.BackPackers;
import com.mycompany.property.model.accomodationPackage.Impl.BedAndBreakfast;
import com.mycompany.property.model.accomodationPackage.Impl.Hotel;
import com.mycompany.property.model.accomodationPackage.Impl.StudentAccomodation;
import com.mycompany.property.model.locationPackage.AreaStats;
import com.mycompany.property.model.locationPackage.Location;
import com.mycompany.property.model.propertyPackage.Building;
import com.mycompany.property.model.propertyPackage.Commune;
import com.mycompany.property.model.propertyPackage.Farm;
import com.mycompany.property.model.propertyPackage.GolfEstate;
import com.mycompany.property.model.propertyPackage.Land;
import com.mycompany.property.model.propertyPackage.Loft;
import com.mycompany.property.model.propertyPackage.PentHouse;
import com.mycompany.property.model.propertyPackage.Property;
import com.mycompany.property.model.propertyPackage.StandardHouse;
import com.mycompany.property.model.propertyPackage.Studio;
import com.mycompany.property.model.propertyPackage.TownHouse;
import com.mycompany.property.model.userPackage.Impl.Bond;
import com.mycompany.property.model.userPackage.Impl.Buying;
import com.mycompany.property.model.userPackage.Impl.Ratings;
import com.mycompany.property.model.userPackage.Impl.Renting;
import com.mycompany.property.model.userPackage.Impl.UserBuying;
import com.mycompany.property.model.userPackage.Impl.UserSelling;
import static javax.swing.Spring.height;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author donkey
 */
public class appConfiguration {
    
    @Bean(name="building")
    public Building.Builder getProperty()
    {
        return new Building.Builder(5, 2.0);
    }
    
    @Bean(name="commune")
    public Commune.Builder getCommune()
    {
        return new Commune.Builder(5);
    }
    
    @Bean(name="farm")
    public Farm.Builder getBuilder()
    {
        return new Farm.Builder("Animal");
    }
    
    @Bean(name="golfEstate")
    public GolfEstate.Builder getGoldEstate()
    {
        return new GolfEstate.Builder("Tuscan");
    }
    
    @Bean(name="land")
    public Land.Builder getLand()
    {
        return new Land.Builder("wild");
    }
    
    @Bean(name="loft")
    public Loft.Builder getLoft()
    {
        return new Loft.Builder(3.0);
    }
    
    @Bean(name="penthouse")
    public PentHouse.Builder getPentHouse()
    {
        return new PentHouse.Builder("Protea Hotel");
    }
    
    @Bean(name="standardHouse")
    public StandardHouse.Builder getStandardHOuse()
    {
        return new StandardHouse.Builder(true);
    }
    
    @Bean(name="studio")
    public Studio.Builder getStudio()
    {
        return new Studio.Builder(300);
    }
    
    @Bean(name="townHouse")
    public TownHouse.Builder getTownHouse()
    {
        return new TownHouse.Builder(1);
    }
     
    @Bean(name="backpackers")
    public BackPackers.Builder getbackpackers()
    {
        return new BackPackers.Builder("obz");
    }
    @Bean(name="bedandbreakfast")
    public BedAndBreakfast.Builder getbedAndBreakfast()
    {
        return new BedAndBreakfast.Builder(true);
    }
    @Bean(name="hotel")
    public Hotel.Builder getHotel()
    {
        return new Hotel.Builder(4);
    }
    @Bean(name="studentaccomodation")
    public StudentAccomodation.Builder stdAcc()
    {
        return new StudentAccomodation.Builder("cput");
    }
    @Bean(name="areastats")
    public AreaStats.Builder areastat()
    {
        return new AreaStats.Builder(23);
    }
    @Bean(name="location")
    public Location.Builder getLocation()
    {
        return new Location.Builder("pretoria");
    }
    @Bean(name="bond")
    public Bond.Builder getBond()
    {
        return new Bond.Builder(20);
    }
    @Bean(name="buying")
    public Buying.Builder getBuying()
    {
        return new Buying.Builder(50000);
    }
    
        
    @Bean(name="renting")
    public Renting.Builder getRenting()
    {
        return new Renting.Builder(6000);
    }
    @Bean(name="userselling")
    public UserSelling.Builder getBiulding()
    {
        return new UserSelling.Builder(800000);
    }
    @Bean(name="userbuying")
    public UserBuying.Builder getUserBuyuing()
    {
        return new UserBuying.Builder(true);
    }
  
    
    
    
}
