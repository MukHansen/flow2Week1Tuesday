package entity;

import entity.Address4;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T10:40:50")
@StaticMetamodel(Customer4.class)
public class Customer4_ { 

    public static volatile SingularAttribute<Customer4, String> firstName;
    public static volatile SingularAttribute<Customer4, String> lastName;
    public static volatile ListAttribute<Customer4, Address4> addresses;
    public static volatile SingularAttribute<Customer4, Integer> id;

}