/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.Services.Crud;

import com.mycompany.property.model.Commune;
import com.mycompany.property.model.Farm;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author donkey
 */
public class FarmCrudServiceImpl implements FarmCrudService{
    
     @Transactional(propagation = Propagation.SUPPORTS)
    public Farm find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Farm persist(Farm entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Farm merge(Farm entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Farm remove(Farm entity) {

        return  null;

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Farm> findAll() {
        return null;
    }
    
    
}
