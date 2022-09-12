package com.mygym.aviationservice.persistance.repository;

import com.mygym.aviationservice.persistance.entity.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
