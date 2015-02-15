package com.xplicit.entities;

import com.xplicit.entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-01-28T12:16:43")
@StaticMetamodel(Productlines.class)
public class Productlines_ { 

    public static volatile SingularAttribute<Productlines, String> productLine;
    public static volatile CollectionAttribute<Productlines, Products> productsCollection;
    public static volatile SingularAttribute<Productlines, byte[]> image;
    public static volatile SingularAttribute<Productlines, String> htmlDescription;
    public static volatile SingularAttribute<Productlines, String> textDescription;

}