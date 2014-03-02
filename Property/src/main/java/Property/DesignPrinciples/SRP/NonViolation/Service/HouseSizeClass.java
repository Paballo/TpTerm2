/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.SRP.NonViolation.Service;

/**
 *
 * @author donkey
 */
public class HouseSizeClass {
    
    public int area(int length, int width)
    {
        return length * width;
    }
    
    public int volume(int length, int width, int height)
    {
        return length * width * height;
    }
    
}
