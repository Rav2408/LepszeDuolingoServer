package com.example.lepszeduolingoserver.unlockedword;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import com.example.lepszeduolingoserver.word.Word;
import com.example.lepszeduolingoserver.word.WordDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unlockedword")
public class UnlockedWordResource  implements SimpleResource<UnlockedWord, UnlockedWordDTO, Long> {

    private final UnlockedWordService unlockedWordService;

    public UnlockedWordResource(UnlockedWordService unlockedWordService) {
        this.unlockedWordService = unlockedWordService;
    }

    @Override
    public CrudService<UnlockedWord, UnlockedWordDTO, Long> getService() {
        return unlockedWordService;
    }
}
