package com.xplicit.entities;

import com.xplicit.entities.Customers;
import com.xplicit.entities.Employees;
import com.xplicit.entities.Offices;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-28T12:16:43")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, String> extension;
    public static volatile CollectionAttribute<Employees, Customers> customersCollection;
    public static volatile CollectionAttribute<Employees, Employees> employeesCollection;
    public static volatile SingularAttribute<Employees, String> lastName;
    public static volatile SingularAttribute<Employees, Offices> officeCode;
    public static volatile SingularAttribute<Employees, String> email;
    public static volatile SingularAttribute<Employees, Employees> reportsTo;
    public static volatile SingularAttribute<Employees, Integer> employeeNumber;
    public static volatile SingularAttribute<Employees, String> firstName;
    public static volatile SingularAttribute<Employees, String> jobTitle;

}