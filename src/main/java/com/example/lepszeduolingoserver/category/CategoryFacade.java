package com.example.lepszeduolingoserver.category;

import java.util.List;
import java.util.Optional;

public class CategoryFacade {

    private CategoryService categoryService;

    public CategoryFacade(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public List<CategoryDTO> findAll() {
        return categoryService.findAllDto();
    }

    public Optional<CategoryDTO> findById(Long id) {
        return categoryService.findDtoById(id);
    }

    public Optional<CategoryDTO> save(CategoryDTO category) {;
        return categoryService.findDtoById(categoryService.save(category).getId());
    }

    public void deleteById(Long id) {
        categoryService.deleteById(id);
    }
}
