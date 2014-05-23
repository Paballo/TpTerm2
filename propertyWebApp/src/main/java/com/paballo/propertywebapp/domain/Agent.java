/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author donkey
 */
@Entity
public class Agent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String email;
    
    private String number;
    
    public Agent()
    {
        
    }   

    private Agent(Builder builder) {
        
        id      = builder.id;
        name    = builder.name;
        email   = builder.email;
        number  = builder.number;
    }
    
    public static class Builder
    {
        private Long id;
        private String name;
        private String email;
        private String number;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id  = value;
            return this;
        }
        public Builder name(String value)
        {
            name = value;
            return this;
        }
        public Builder email(String value)
        {
            email = value;
            return this;
        }
        public Builder number(String value)
        {
            number = value;
            return this;
        }
        
        public Builder Agent(Agent agent)
        {
            id     = agent.getId();
            name   = agent.getName();
            email  = agent.getEmail();
            number = agent.getNumber();
            return this;
        }
        
        public Agent build()
        {
            return new Agent(this);
        }
        
        
    }
            

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

   

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }
    
    
    
    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Agent[ id=" + id + " ]";
    }
    
}
