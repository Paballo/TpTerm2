/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.Inheritence;

/**
 *
 * @author donkey
 */
public class Mansion extends building{
    
    public String mansionfloors()
    {
      String floors =  super.floors()+" so do mansions";
      return floors;
    }
            
    
}
