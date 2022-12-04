package com.example.lepszeduolingoserver.infrastructure;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface EntityToDtoMapper<E, DTO> {

    DTO mapToDto(E entity);

    default List<DTO> mapToDto(List<E> entities) {
        return Stream.ofNullable(entities).flatMap(Collection::stream).map(this::mapToDto).collect(Collectors.toList());
    }
}
