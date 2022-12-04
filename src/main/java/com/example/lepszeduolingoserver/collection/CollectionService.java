package com.example.lepszeduolingoserver.collection;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class CollectionService implements CrudService<Collection, CollectionDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Collection mapToEntity(CollectionDTO collectionDTO) {
        return null;
    }

    @Override
    public CollectionDTO mapToDto(Collection entity) {
        return null;
    }

    @Override
    public JpaRepository<Collection, Long> getRepo() {
        return null;
    }
}
