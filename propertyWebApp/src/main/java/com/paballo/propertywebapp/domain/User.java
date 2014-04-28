/*
 * 
To change this license header, choose License Headers in Project Properties.To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paballo.propertywebapp.domain;

import java.io.Serializable;
import java.util.Locale.Builder;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author donkey
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    private String deal;
    
    @Column(unique = true)
    private String user_email;
    
    
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "User_id")

    private User(Builder builder) {
        
        id       = builder.id;
        name     = builder.name;
        lastname = builder.lastname;
        deal     = builder.deal;
       
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    public static class Builder
    {
        private Long    id;
        private String  name;
        private String  lastname;
        private String  deal;
        private String  user_email;
        
        
        public Builder(String user_email)
        {
            this.user_email = user_email;
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
        public Builder lastname(String value)
        {
            lastname = value;
            return this;
        }
        public Builder deal(String value)
        {
            deal  = value;
            return this;
        }
        
        public Builder user(User user)
        {
            id         = user.getId();
            name       = user.getName();
            lastname   = user.getLastname();
            user_email = user.getUser_email();
            deal       = user.getDeal();
            return this;
        }
       
        public User build()
        {
            return new User(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDeal() {
        return deal;
    }

    public String getUser_email() {
        return user_email;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.User[ id=" + id + " ]";
    }
    
}
