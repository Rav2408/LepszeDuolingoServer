package com.example.lepszeduolingoserver.category;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

    CategoryFacade categoryFacade;
    public CategoryResource(CategoryFacade categoryFacade) {
        this.categoryFacade = categoryFacade;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategory() {
        return categoryFacade.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CategoryDTO> getCategoryById(@PathVariable Long id) {
        return categoryFacade.findById(id);
    }

    @PostMapping
    public Optional<CategoryDTO> postCategoryBody(@Valid @RequestBody CategoryDTO category) {
        return categoryFacade.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable Long id) {
        categoryFacade.deleteById(id);
    }

}
