package com.example.lepszeduolingoserver.collection;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CollectionService implements CrudService<Collection, CollectionDTO, Long> {

    private final CollectionRepository collectionRepository;
    private final CollectionMapper collectionMapper = Mappers.getMapper(CollectionMapper.class);

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Collection mapToEntity(CollectionDTO collectionDTO) {
        return collectionMapper.toEntity(collectionDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public CollectionDTO mapToDto(Collection entity) {
        return collectionMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Collection, Long> getRepo() {
        return collectionRepository;
    }
}
