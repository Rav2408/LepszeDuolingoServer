package com.example.lepszeduolingoserver.word;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/word")
public class WordResource implements SimpleResource<Word, WordDTO, Long> {

    private WordService wordService;

    public WordResource(WordService wordService) {
        this.wordService = wordService;
    }

    @Override
    public CrudService<Word, WordDTO, Long> getService() {
        return wordService;
    }
}
