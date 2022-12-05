package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface DuolingoUserMapper extends SimpleMapper<DuolingoUser, DuolingoUserDTO> {
}
