/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.app;

import com.mycompany.property.Services.Crud.AreaStatCrud;
import com.mycompany.property.Services.Crud.AreaStatCrudImpl;
import com.mycompany.property.Services.Crud.BackPackersCrudService;
import com.mycompany.property.Services.Crud.BackPackersCrudServiceImpl;
import com.mycompany.property.Services.Crud.BondCrudServiceImpl;
import com.mycompany.property.Services.Crud.BuildingCrudService;
import com.mycompany.property.Services.Crud.BuildingCrudServiceImpl;
import com.mycompany.property.Services.Crud.CommuneCrudService;
import com.mycompany.property.Services.Crud.CommuneCrudServiceImpl;
import com.mycompany.property.Services.Crud.FarmCrudService;
import com.mycompany.property.Services.Crud.FarmCrudServiceImpl;
import com.mycompany.property.Services.Crud.BondCrudService;
import org.springframework.context.annotation.Bean;




/**
 *
 * @author donkey
 */
public class appConfiguration {
    
   
  
     @Bean(name = "buildingCrudService")
    public  BuildingCrudService getBuildingCrudService(){
        return new BuildingCrudServiceImpl();
    }
    
    @Bean(name = "communeCrudService")
    public CommuneCrudService getCommuneCrudService()
    {
        return new CommuneCrudServiceImpl();
    }
    @Bean(name="areaStatCrud")
    public AreaStatCrud getAreaStat()
    {
        return new AreaStatCrudImpl();
    }
    
    @Bean(name = "backPackersCrudService")
    public BackPackersCrudService getCrud()
    {
        return new BackPackersCrudServiceImpl();
    }
    
    @Bean(name = "farmCrudService")
    public FarmCrudService getFarm()
    {
        return new FarmCrudServiceImpl();
    }
    
    @Bean(name = "bond")
    public BondCrudService getBond()
    {
        return new BondCrudServiceImpl();
    }
}
