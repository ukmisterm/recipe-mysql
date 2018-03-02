package com.mark.spring.controllers;

import com.mark.spring.domain.Category;
import com.mark.spring.domain.UnitOfMeasure;
import com.mark.spring.repositories.CategoryRepository;
import com.mark.spring.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by marklovatt on 02/03/2018.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByUom("Teaspoon");

        System.out.println("Cat Id is:" + categoryOptional.get().getId());
        System.out.println("UoM ID is:" + unitOfMeasure.get().getId());

        return "index";
    }
}
