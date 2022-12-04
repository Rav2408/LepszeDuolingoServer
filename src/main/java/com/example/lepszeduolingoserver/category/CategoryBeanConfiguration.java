package com.example.lepszeduolingoserver.category;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryBeanConfiguration {

    @Bean
    public CategoryFacade categoryFacade(CategoryRepository categoryRepository){
        return new CategoryFacade(categoryService(categoryRepository, categoryMapper()));
    }

    private CategoryService categoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper){
        return new CategoryService(categoryRepository,categoryMapper);
    }
    private CategoryMapper categoryMapper(){
        return Mappers.getMapper(CategoryMapper.class);
    }

}
