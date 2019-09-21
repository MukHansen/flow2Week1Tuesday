package entity;

import entity.Customer5;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T10:40:50")
@StaticMetamodel(Address5.class)
public class Address5_ { 

    public static volatile SingularAttribute<Address5, String> city;
    public static volatile SingularAttribute<Address5, String> street;
    public static volatile SingularAttribute<Address5, Integer> id;
    public static volatile ListAttribute<Address5, Customer5> customers;
    public static volatile SingularAttribute<Address5, Customer5> customer;

}