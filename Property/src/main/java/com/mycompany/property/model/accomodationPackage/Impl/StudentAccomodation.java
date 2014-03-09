/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.accomodationPackage.Impl;

import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class StudentAccomodation {
    
    private String institution;

    private StudentAccomodation(Builder b) {
       
        this.institution = b.institution;
    }
    
    public static class Builder
    {
        private String institution;
        
        public Builder(String institution)
        {
            this.institution = institution;
        }
        
        public Builder studentAccomodation(String institution)
        {
            this.institution = institution;
            return this;
        }
        
        public StudentAccomodation studentAccomodation()
        {
            return new StudentAccomodation(this);
        }
    }

    public String getInstitution() {
        return institution;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.institution);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentAccomodation other = (StudentAccomodation) obj;
        if (!Objects.equals(this.institution, other.institution)) {
            return false;
        }
        return true;
    }
    
}
