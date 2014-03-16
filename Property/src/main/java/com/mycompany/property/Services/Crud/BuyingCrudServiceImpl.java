/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.Services.Crud;

import com.mycompany.property.model.BackPackers;
import com.mycompany.property.model.Buying;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author donkey
 */
public class BuyingCrudServiceImpl implements BuyingCrudService {
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Buying find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Buying persist(Buying entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Buying merge(Buying entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Buying remove(Buying entity) {

        return  null;

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Buying> findAll() {
        return null;
    }
    
}
