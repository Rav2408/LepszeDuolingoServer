package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class DuolingoUserService implements CrudService<DuolingoUser, DuolingoUserDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public DuolingoUser mapToEntity(DuolingoUserDTO duolingoUserDTO) {
        return null;
    }

    @Override
    public DuolingoUserDTO mapToDto(DuolingoUser entity) {
        return null;
    }

    @Override
    public JpaRepository<DuolingoUser, Long> getRepo() {
        return null;
    }
}
