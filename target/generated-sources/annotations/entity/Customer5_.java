package entity;

import entity.Address5;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T10:40:50")
@StaticMetamodel(Customer5.class)
public class Customer5_ { 

    public static volatile SingularAttribute<Customer5, Address5> add;
    public static volatile SingularAttribute<Customer5, String> firstName;
    public static volatile SingularAttribute<Customer5, String> lastName;
    public static volatile ListAttribute<Customer5, Address5> addresses;
    public static volatile SingularAttribute<Customer5, Integer> id;

}