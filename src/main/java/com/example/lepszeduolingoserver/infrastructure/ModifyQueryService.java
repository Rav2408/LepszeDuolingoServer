package com.example.lepszeduolingoserver.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ModifyQueryService <E extends Identifiable<ID>, DTO, ID>
        extends EntityToDtoMapper<E, DTO>, DtoToEntityMapper<E, DTO>{

    JpaRepository<E, ID> getRepo();

    @Transactional(rollbackFor = Throwable.class)
    default DTO save(DTO dto) {
        return save(dto, false);
    }

    default DTO save(DTO dto, boolean flush) {
        E entity = mapToEntity(dto);
        E savedEntity = save(entity);

        if (flush) {
            getRepo().flush();
        }
        return mapToDto(savedEntity);
    }

    @Transactional(rollbackFor = Throwable.class)
    default E save(E entity) {
        return getRepo().save(entity);
    }
}
