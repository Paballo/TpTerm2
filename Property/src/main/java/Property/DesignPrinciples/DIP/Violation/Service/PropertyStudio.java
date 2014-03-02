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
public class PropertyStudio extends PropertyType{
    
    public PropertyStudio() {
        
       
    }
    
    public String studio()
    {
        String sentence =  super.discription() + " a Studio" ;
        
        return sentence;
    }
    
}
