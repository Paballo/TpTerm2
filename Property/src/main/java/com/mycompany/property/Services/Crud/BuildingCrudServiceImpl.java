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
public class BuildingCrudServiceImpl implements BuildingCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public com.mycompany.property.model.Building find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public com.mycompany.property.model.Building persist(com.mycompany.property.model.Building entity) {
       return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public com.mycompany.property.model.Building merge(com.mycompany.property.model.Building entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public com.mycompany.property.model.Building remove(com.mycompany.property.model.Building entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<com.mycompany.property.model.Building> findAll() {
        return null;
    }
    
   
    
}
