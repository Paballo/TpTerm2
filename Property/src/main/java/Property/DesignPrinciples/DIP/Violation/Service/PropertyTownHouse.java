/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.DIP.Violation.Service;

/**
 *
 * @author donkey
 */
public class PropertyTownHouse  extends PropertyType{

    public PropertyTownHouse() {
        
       
    }
    
    public String townHouse()
    {
        String sentence =  super.discription() + " a Town House" ;
        
        return sentence;
    }
    
    
    
}
