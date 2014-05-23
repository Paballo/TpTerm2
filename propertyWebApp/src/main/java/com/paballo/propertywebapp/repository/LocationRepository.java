/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.repository;

import com.paballo.propertywebapp.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author donkey
 */
public interface LocationRepository extends JpaRepository<Location, Long>
{
    
}
