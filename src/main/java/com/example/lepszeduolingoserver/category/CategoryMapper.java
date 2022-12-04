package com.example.lepszeduolingoserver.category;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CategoryMapper extends SimpleMapper<Category, CategoryDTO> {

//    @Mapping(target = "difficulty.id", source = "categoryDTO.id")
//    Category toEntity(CategoryDTO categoryDTO);

    //    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
//
//    CategoryDTO categoryToCategoryDto(Category category);

}
