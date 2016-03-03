package PK1Maven.Contracts;

import PK1Maven.Contracts.City;
import PK1Maven.Contracts.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-03T09:13:10")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile CollectionAttribute<Department, Person> personsCollection;
    public static volatile SingularAttribute<Department, Integer> id;
    public static volatile SingularAttribute<Department, City> cityid;
    public static volatile SingularAttribute<Department, String> title;

}