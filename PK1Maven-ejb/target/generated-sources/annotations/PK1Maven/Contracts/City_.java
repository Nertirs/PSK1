package PK1Maven.Contracts;

import PK1Maven.Contracts.Department;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-03T09:13:10")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> name;
    public static volatile SingularAttribute<City, Integer> id;
    public static volatile CollectionAttribute<City, Department> departmentsCollection;

}