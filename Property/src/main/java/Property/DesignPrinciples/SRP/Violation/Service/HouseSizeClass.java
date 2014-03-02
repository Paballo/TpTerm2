/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.SRP.Violation.Service;

/**
 *
 * @author donkey
 */
public class HouseSizeClass {
    
    public int houseSize(int length,int width,int height)
    {
        //calculating the area
        int area = length * width;
        
        //calculating the volume
        int volume = area * height;
        
        return volume;
        
    }
    
}
