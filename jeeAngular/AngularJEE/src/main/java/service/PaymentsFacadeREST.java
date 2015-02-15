/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.xplicit.entities.Payments;
import com.xplicit.entities.PaymentsPK;
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
@Path("payments")
public class PaymentsFacadeREST extends AbstractFacade<Payments> {
    @PersistenceContext(unitName = "AngularJEEPU")
    private EntityManager em;

    private PaymentsPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;customerNumber=customerNumberValue;checkNumber=checkNumberValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.xplicit.entities.PaymentsPK key = new com.xplicit.entities.PaymentsPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> customerNumber = map.get("customerNumber");
        if (customerNumber != null && !customerNumber.isEmpty()) {
            key.setCustomerNumber(new java.lang.Integer(customerNumber.get(0)));
        }
        java.util.List<String> checkNumber = map.get("checkNumber");
        if (checkNumber != null && !checkNumber.isEmpty()) {
            key.setCheckNumber(checkNumber.get(0));
        }
        return key;
    }

    public PaymentsFacadeREST() {
        super(Payments.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Payments entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Payments entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.xplicit.entities.PaymentsPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Payments find(@PathParam("id") PathSegment id) {
        com.xplicit.entities.PaymentsPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Payments> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Payments> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
