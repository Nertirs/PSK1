package PK1Maven.Contracts;

import PK1Maven.Contracts.Department;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-01T21:31:33")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> firstname;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile CollectionAttribute<Person, Department> departmentsCollection;
    public static volatile SingularAttribute<Person, Integer> socialnumber;
    public static volatile SingularAttribute<Person, String> lastname;

}