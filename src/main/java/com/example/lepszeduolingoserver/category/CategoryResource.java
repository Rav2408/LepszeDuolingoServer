package com.example.lepszeduolingoserver.category;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.ModifyQueryService;
import jakarta.validation.Valid;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryResource implements ModifyQueryService<Category, CategoryDTO, Long> {

    CategoryRepository categoryRepository;
    CategoryMapper categoryMapper = Mappers.getMapper(CategoryMapper.class);

    public CategoryResource(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategory() {
        return mapToDto(categoryRepository.findAll());
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id) {
        return categoryRepository.findById(id);
    }

    @PostMapping
    public CategoryDTO postCategoryBody(@Valid @RequestBody CategoryDTO category) {
        categoryRepository.save(mapToEntity(category));
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category mapToEntity(CategoryDTO categoryDTO) {
        return categoryMapper.toEntity(categoryDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public CategoryDTO mapToDto(Category entity) {
        return categoryMapper.toDto(entity,new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Category, Long> getRepo() {
        return categoryRepository;
    }
}
