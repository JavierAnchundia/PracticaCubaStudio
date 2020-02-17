package com.company.untitled.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

//Name Pattern es la forma en la que se me va a empezar a filtrar cuando por ejemplo se busque por filtros, es decir como
// con la opcion ctrl + f , asi como que voy escribiendo el nombre y el apellido y se va a empezar a filtrar
@NamePattern("%s %s| firstName, lastName")
@Table(name = "UNTITLED_SPEAKER")
@Entity(name = "untitled_Speaker")
public class Speaker extends StandardEntity {
    private static final long serialVersionUID = 2577368627663010055L;


    @NotNull
    @Column(name = "FIRST_NAME", nullable=false)
    protected String firstName;


    @Column(name = "LAST_NAME", nullable=false)
    protected String lastName;


    @Email
    @NotNull
    @Column(name= "EMAIL", nullable = false, unique = true)
    protected String email;

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}
    public String getLastName(){return lastName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName = firstName;}

    @MetaProperty
    public String getNombreCompleto()
    {
        return lastName + " " + firstName;
    }

}