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
public class Lease implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String landLord;
    private String leaseTerm;
    private String tenant;
    
    private Lease()
    {
        
    }

    private Lease(Builder aThis) {
        
        id = aThis.id;
        landLord = aThis.landLord;
        leaseTerm = aThis.leaseTerm;
        tenant = aThis.tenant;
    }
    
    public static class Builder
    {
        private Long id;
        private String landLord;
        private String leaseTerm;
        private String tenant;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder landLord(String value)
        {
            landLord = value;
            return this;
        }
        public Builder leaseTerm(String value)
        {
            leaseTerm = value;
            return this;
        }
        public Builder  tenant(String value)
        {
            tenant = value;
            return this;
        }
        public Builder Lease(Lease lease)
        {
            id = lease.getId();
            landLord = lease.getLandLord();
            leaseTerm = lease.getLeaseTerm();
            tenant  = lease.getTenant();
            return this;
        }
        public Lease build()
        {
            return new Lease(this);
        }
    }
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLandLord() {
        return landLord;
    }

    public String getLeaseTerm() {
        return leaseTerm;
    }

    public String getTenant() {
        return tenant;
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
        if (!(object instanceof Lease)) {
            return false;
        }
        Lease other = (Lease) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Leese[ id=" + id + " ]";
    }
    
}
