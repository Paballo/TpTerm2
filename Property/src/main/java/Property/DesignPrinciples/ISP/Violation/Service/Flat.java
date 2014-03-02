/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.ISP.Violation.Service;

import Property.DesignPrinciples.ISP.Violation.PropertyHouseInterface;

/**
 *
 * @author donkey
 */
public class Flat implements PropertyHouseInterface{

    @Override
    public int doors() {
        
        
        return 1;
        
    }

    @Override
    public int stove() {
        
        return 1;
    }
    
    
}
