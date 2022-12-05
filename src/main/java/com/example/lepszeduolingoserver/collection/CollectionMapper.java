package com.example.lepszeduolingoserver.collection;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface CollectionMapper extends SimpleMapper<Collection, CollectionDTO> {
}
