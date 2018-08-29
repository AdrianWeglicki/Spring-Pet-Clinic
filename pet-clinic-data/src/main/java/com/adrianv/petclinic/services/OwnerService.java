package com.adrianv.petclinic.services;

import com.adrianv.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
