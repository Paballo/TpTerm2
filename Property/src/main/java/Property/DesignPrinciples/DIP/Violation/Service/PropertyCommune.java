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
public class PropertyCommune extends PropertyType {

    public PropertyCommune() {
    }
    
     public String commune()
    {
        String sentence =  super.discription() + " a commune" ;
        
        return sentence;
    }
}
