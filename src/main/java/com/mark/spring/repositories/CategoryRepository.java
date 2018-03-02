package com.mark.spring.repositories;

import com.mark.spring.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by marklovatt on 02/03/2018.
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
