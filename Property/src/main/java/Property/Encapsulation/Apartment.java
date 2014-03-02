/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.Encapsulation;

/**
 *
 * @author donkey
 */
public class Apartment {
    
   private int bedrooms;
   private double price;

    public Apartment(int bedrooms, double price) {
        this.bedrooms = bedrooms;
        this.price = price;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    public int getBedrooms() {
        return bedrooms;
    }

    public double getPrice() {
        return price;
    }
   
   
    
}
