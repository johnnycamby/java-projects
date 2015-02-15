/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.xplicit.entities.Orderdetails;
import com.xplicit.entities.OrderdetailsPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author johnny
 */
@Stateless
@Path("orderdetails")
public class OrderdetailsFacadeREST extends AbstractFacade<Orderdetails> {
    @PersistenceContext(unitName = "AngularJEEPU")
    private EntityManager em;

    private OrderdetailsPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;orderNumber=orderNumberValue;productCode=productCodeValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.xplicit.entities.OrderdetailsPK key = new com.xplicit.entities.OrderdetailsPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> orderNumber = map.get("orderNumber");
        if (orderNumber != null && !orderNumber.isEmpty()) {
            key.setOrderNumber(new java.lang.Integer(orderNumber.get(0)));
        }
        java.util.List<String> productCode = map.get("productCode");
        if (productCode != null && !productCode.isEmpty()) {
            key.setProductCode(productCode.get(0));
        }
        return key;
    }

    public OrderdetailsFacadeREST() {
        super(Orderdetails.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Orderdetails entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Orderdetails entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.xplicit.entities.OrderdetailsPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Orderdetails find(@PathParam("id") PathSegment id) {
        com.xplicit.entities.OrderdetailsPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Orderdetails> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Orderdetails> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
