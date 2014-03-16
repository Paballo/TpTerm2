/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.Services.Crud;

import com.mycompany.property.model.AreaStats;
import com.mycompany.property.model.Bond;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author donkey
 */
public class AreaStatCrudImpl implements AreaStatCrud {
    
     @Transactional(propagation = Propagation.SUPPORTS)
    public AreaStats find(String s) {
        return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public AreaStats persist(AreaStats entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AreaStats merge(AreaStats entity) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public AreaStats remove(AreaStats entity) {

        return  null;

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AreaStats> findAll() {
        return null;
    }
    
}
