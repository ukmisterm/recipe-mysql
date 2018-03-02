package com.mark.spring.repositories;

import com.mark.spring.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marklovatt on 02/03/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long>{
}
