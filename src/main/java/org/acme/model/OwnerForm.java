package org.acme.model;

import javax.ws.rs.FormParam;

public class OwnerForm {

    public @FormParam("firstName") String firstName;
    public @FormParam("lastName") String lastName;
    public @FormParam("address") String address;
    public @FormParam("city") String city;
    public @FormParam("telephone") String telephone;

    public Owners addOwner() {
        Owners newOwner = new Owners();
        newOwner.firstName = firstName;
        newOwner.lastName = lastName;
        newOwner.address = address;
        newOwner.city = city;
        newOwner.telephone = telephone;
        return newOwner;
    }

    public Owners editOwner(Owners existingOwner) {
        existingOwner.firstName = firstName;
        existingOwner.lastName = lastName;
        existingOwner.address = address;
        existingOwner.city = city;
        existingOwner.telephone = telephone;
        return existingOwner;
    }
    
}
