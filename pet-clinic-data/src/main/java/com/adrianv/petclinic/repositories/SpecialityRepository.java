package com.adrianv.petclinic.repositories;

import com.adrianv.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
