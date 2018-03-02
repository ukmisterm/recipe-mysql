package com.mark.spring.repositories;

import com.mark.spring.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by marklovatt on 02/03/2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByUom(String uom);
}
