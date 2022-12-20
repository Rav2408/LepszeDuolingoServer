package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DuolingoUserService implements CrudService<DuolingoUser, DuolingoUserDTO, Long> {

    private final DuolingoUserRepository duolingoUserRepository;
    private final DuolingoUserMapper duolingoUserMapper = Mappers.getMapper(DuolingoUserMapper.class);

    public DuolingoUserService(DuolingoUserRepository duolingoUserRepository) {
        this.duolingoUserRepository = duolingoUserRepository;
    }

    @Override
    public String getEntityName() {
        return DuolingoUser.class.getName();
    }

    @Override
    public DuolingoUser mapToEntity(DuolingoUserDTO duolingoUserDTO) {
        return duolingoUserMapper.toEntity(duolingoUserDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public DuolingoUserDTO mapToDto(DuolingoUser entity) {
        return duolingoUserMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<DuolingoUser, Long> getRepo() {
        return duolingoUserRepository;
    }

    public boolean existsByEmail(String email) {
        return duolingoUserRepository.existsByEmail(email);
    }

    public String findUserSaltByEmail(String email) {
        Optional<DuolingoUser> duolingoUser = duolingoUserRepository.findByEmail(email);

        if(duolingoUser.isPresent()){
            return duolingoUser.get().getSalt();
        }
        return null;
    }

    public DuolingoUserDTO getUserByEmail(String email) {
        return duolingoUserRepository.findByEmail(email).map(this::mapToDto)
                .orElseThrow(()-> new IllegalStateException(String.format("User with email %s does not exists",email)));
    }

    public DuolingoUserDTO auth(String email, String hash) {
        DuolingoUserDTO duolingoUserDTO = getUserByEmail(email);
        if(duolingoUserDTO!=null && duolingoUserDTO.getHash()==hash){
            return duolingoUserDTO;
        }
        return null;
    }
}
