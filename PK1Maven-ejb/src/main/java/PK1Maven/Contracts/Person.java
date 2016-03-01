/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PK1Maven.Contracts;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nertirs
 */
@Entity
@Table(name = "PERSONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persons.findAll", query = "SELECT p FROM Persons p"),
    @NamedQuery(name = "Persons.findById", query = "SELECT p FROM Persons p WHERE p.id = :id"),
    @NamedQuery(name = "Persons.findBySocialnumber", query = "SELECT p FROM Persons p WHERE p.socialnumber = :socialnumber"),
    @NamedQuery(name = "Persons.findByFirstname", query = "SELECT p FROM Persons p WHERE p.firstname = :firstname"),
    @NamedQuery(name = "Persons.findByLastname", query = "SELECT p FROM Persons p WHERE p.lastname = :lastname")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOCIALNUMBER")
    private Integer socialnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "LASTNAME")
    private String lastname;
    @ManyToMany(mappedBy = "personsCollection")
    private Collection<Department> departmentsCollection;

    public Person() {
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, int socialnumber, String firstname, String lastname) {
        this.id = id;
        this.socialnumber = socialnumber;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSocialnumber() {
        return socialnumber;
    }

    public void setSocialnumber(int socialnumber) {
        this.socialnumber = socialnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @XmlTransient
    public Collection<Department> getDepartmentsCollection() {
        return departmentsCollection;
    }

    public void setDepartmentsCollection(Collection<Department> departmentsCollection) {
        this.departmentsCollection = departmentsCollection;
    }

    @Override
    public int hashCode() {
    return socialnumber.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person))
            return false;
        
        Person other = (Person) object;
        return socialnumber.equals(other.socialnumber);
    }

    @Override
    public String toString() {
        return "PK1Maven.Contracts.Persons[ id=" + id + " ]";
    }
    
}
