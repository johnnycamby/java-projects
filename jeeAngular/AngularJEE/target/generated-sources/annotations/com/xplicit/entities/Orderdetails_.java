package com.xplicit.entities;

import com.xplicit.entities.OrderdetailsPK;
import com.xplicit.entities.Orders;
import com.xplicit.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-28T12:16:43")
@StaticMetamodel(Orderdetails.class)
public class Orderdetails_ { 

    public static volatile SingularAttribute<Orderdetails, Double> priceEach;
    public static volatile SingularAttribute<Orderdetails, OrderdetailsPK> orderdetailsPK;
    public static volatile SingularAttribute<Orderdetails, Short> orderLineNumber;
    public static volatile SingularAttribute<Orderdetails, Orders> orders;
    public static volatile SingularAttribute<Orderdetails, Integer> quantityOrdered;
    public static volatile SingularAttribute<Orderdetails, Products> products;

}