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
public class MovingCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String number;
    private String email;

    private MovingCompany()
    {
        
    }

    private MovingCompany(Builder aThis) {
        
        id = aThis.id;
        name = aThis.name;
        number = aThis.number;
        email  = aThis.email;
    }
    
    public static class Builder
    {
         private Long id;
        private String name;
        private String number;
        private String email;
        
        public Builder()
        {
            
        }
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder name(String value)
        {
            name = value;
            return this;
        }
        public Builder number(String value)
        {
            number = value;
            return this;
        }
        public Builder email(String value)
        {
            email = value;
            return this;
        }
        public Builder MovingCompany(MovingCompany movingCompany)
        {
            id = movingCompany.getId();
            name = movingCompany.getName();
            number = movingCompany.getNumber();
            email  = movingCompany.getEmail();
            return this;
        }
        public MovingCompany build()
        {
            return new MovingCompany(this);
        }
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
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
        if (!(object instanceof MovingCompany)) {
            return false;
        }
        MovingCompany other = (MovingCompany) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.MovingCompany[ id=" + id + " ]";
    }
    
}
