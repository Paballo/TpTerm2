/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.Services.Crud;

import com.mycompany.property.model.BackPackers;
import com.mycompany.property.model.Commune;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author donkey
 */
public class CommuneCrudServiceImpl implements CommuneCrudService {
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Commune find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Commune persist(Commune entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Commune merge(Commune entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Commune remove(Commune entity) {

        return  null;

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Commune> findAll() {
        return null;
    }
    
}
