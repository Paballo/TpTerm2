/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.Services.Crud;

import com.mycompany.property.model.Bond;
import com.mycompany.property.model.Building;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author donkey
 */
public class BondCrudServiceImpl implements BondCrudService{
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Bond find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Bond persist(Bond entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Bond merge(Bond entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Bond remove(Bond entity) {

        return  null;

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Bond> findAll() {
        return null;
    }
    
}
