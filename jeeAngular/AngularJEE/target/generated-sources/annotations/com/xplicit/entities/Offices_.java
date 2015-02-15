package com.xplicit.entities;

import com.xplicit.entities.Employees;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-28T12:16:43")
@StaticMetamodel(Offices.class)
public class Offices_ { 

    public static volatile CollectionAttribute<Offices, Employees> employeesCollection;
    public static volatile SingularAttribute<Offices, String> officeCode;
    public static volatile SingularAttribute<Offices, String> phone;
    public static volatile SingularAttribute<Offices, String> postalCode;
    public static volatile SingularAttribute<Offices, String> territory;
    public static volatile SingularAttribute<Offices, String> state;
    public static volatile SingularAttribute<Offices, String> addressLine2;
    public static volatile SingularAttribute<Offices, String> addressLine1;
    public static volatile SingularAttribute<Offices, String> city;
    public static volatile SingularAttribute<Offices, String> country;

}