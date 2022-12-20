package com.example.lepszeduolingoserver.translation;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import com.example.lepszeduolingoserver.word.Word;
import com.example.lepszeduolingoserver.word.WordDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/translation")
public class TranslationResource  implements SimpleResource<Translation, TranslationDTO, Long> {

    private final TranslationService translationService;

    public TranslationResource(TranslationService translationService) {
        this.translationService = translationService;
    }

    @Override
    public CrudService<Translation, TranslationDTO, Long> getService() {
        return translationService;
    }


}
