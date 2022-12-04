package com.example.lepszeduolingoserver.infrastructure.service;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import org.springframework.dao.DataIntegrityViolationException;

public interface CrudService<E extends Identifiable<ID>, DTO, ID>
        extends SearchQueryService<E, DTO, ID>, ModifyQueryService<E, DTO, ID> {

    String DELETION_VIOLATES_DATA_INTEGRITY_ERR = " deletionViolatesDataIntegrity";

    default void deleteById(ID id) throws IllegalStateException {
        try {
            getRepo().deleteById(id);
            getRepo().flush();
        } catch (DataIntegrityViolationException e) {
            e.printStackTrace();
            throw new IllegalStateException(getEntityName() + DELETION_VIOLATES_DATA_INTEGRITY_ERR);
        }
    }
    String getEntityName();
}
