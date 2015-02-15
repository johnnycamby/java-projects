package com.xplicit.entities;

import com.xplicit.entities.Employees;
import com.xplicit.entities.Orders;
import com.xplicit.entities.Payments;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-28T12:16:43")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> customerName;
    public static volatile SingularAttribute<Customers, String> phone;
    public static volatile SingularAttribute<Customers, String> contactLastName;
    public static volatile SingularAttribute<Customers, Employees> salesRepEmployeeNumber;
    public static volatile SingularAttribute<Customers, Integer> customerNumber;
    public static volatile SingularAttribute<Customers, String> contactFirstName;
    public static volatile SingularAttribute<Customers, Double> creditLimit;
    public static volatile SingularAttribute<Customers, String> state;
    public static volatile SingularAttribute<Customers, String> addressLine2;
    public static volatile SingularAttribute<Customers, String> addressLine1;
    public static volatile SingularAttribute<Customers, String> city;
    public static volatile SingularAttribute<Customers, String> country;
    public static volatile SingularAttribute<Customers, String> postalCode;
    public static volatile CollectionAttribute<Customers, Payments> paymentsCollection;
    public static volatile CollectionAttribute<Customers, Orders> ordersCollection;

}