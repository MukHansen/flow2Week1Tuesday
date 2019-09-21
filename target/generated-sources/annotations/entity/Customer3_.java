package entity;

import entity.Address3;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T10:40:50")
@StaticMetamodel(Customer3.class)
public class Customer3_ { 

    public static volatile SingularAttribute<Customer3, String> firstName;
    public static volatile SingularAttribute<Customer3, String> lastName;
    public static volatile ListAttribute<Customer3, Address3> addresses;
    public static volatile SingularAttribute<Customer3, Integer> id;

}