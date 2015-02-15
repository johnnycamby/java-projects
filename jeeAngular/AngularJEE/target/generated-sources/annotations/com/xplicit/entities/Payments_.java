package com.xplicit.entities;

import com.xplicit.entities.Customers;
import com.xplicit.entities.PaymentsPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-28T12:16:43")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile SingularAttribute<Payments, Double> amount;
    public static volatile SingularAttribute<Payments, Date> paymentDate;
    public static volatile SingularAttribute<Payments, PaymentsPK> paymentsPK;
    public static volatile SingularAttribute<Payments, Customers> customers;

}