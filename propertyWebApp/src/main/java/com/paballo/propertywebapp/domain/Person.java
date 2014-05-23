 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String surname;
 
    @Column(unique = true)
    private String email;
    
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "person_id")
    //List <Properties> properties;
    
    private Person()
    {
        
    }

    private Person(Builder builder) {
        
        id         = builder.id;
        name       = builder.name;
        surname    = builder.surname;
        email      = builder.email;
       // properties = builder.properties;
        
    }
    public static class Builder{
        
        private Long id;
        private String name;
        private String surname;
        private String email;
        //List <Properties> properties;
        
        public Builder(String email)
        {
            this.email = email;
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
        
        public Builder surname(String value)
        {
            surname = value;
            return this;
        }
        
       /* public Builder properties(List<Properties> value)
        {
            properties = value;
            return this;
        }
        */
        
        public Builder person(Person person)
        {
            id         = person.getId();
            name       = person.getName();
            surname    = person.getSurname();
            email      = person.getSurname();
           // properties = person.getProperties();
            
            return this;
        }
        
        public Person build()
        {
            return new Person(this);
        }
        
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    /*
    public List<Properties> getProperties() {
        return properties;
    }
    */
    
    

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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Person[ id=" + id + " ]";
    }
    
}
