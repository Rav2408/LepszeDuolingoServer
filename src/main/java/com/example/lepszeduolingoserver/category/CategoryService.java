package com.example.lepszeduolingoserver.category;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class CategoryService implements CrudService<Category, CategoryDTO, Long> {

    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper;

    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Category mapToEntity(CategoryDTO categoryDTO) {
        return categoryMapper.toEntity(categoryDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public CategoryDTO mapToDto(Category entity) {
        return categoryMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Category, Long> getRepo() {
        return categoryRepository;
    }

    @Override
    public String getEntityName() {
        return Category.class.getName();
    }
}
