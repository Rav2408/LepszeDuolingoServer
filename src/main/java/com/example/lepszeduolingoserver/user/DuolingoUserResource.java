package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import com.example.lepszeduolingoserver.word.Word;
import com.example.lepszeduolingoserver.word.WordDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/duolingouser")
public class DuolingoUserResource implements SimpleResource<DuolingoUser, DuolingoUserDTO, Long> {

    private final DuolingoUserService duolingoUserService;

    public DuolingoUserResource(DuolingoUserService duolingoUserService) {
        this.duolingoUserService = duolingoUserService;
    }

    @Override
    public CrudService<DuolingoUser, DuolingoUserDTO, Long> getService() {
        return duolingoUserService;
    }
}
