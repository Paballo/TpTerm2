/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.Polymorphism.Impl;

import Property.Polymorphism.HouseTypeAll;

/**
 *
 * @author donkey
 */
public class Shack implements HouseTypeAll {

    @Override
    public int roof() {
        return  1;
    }
    
}
