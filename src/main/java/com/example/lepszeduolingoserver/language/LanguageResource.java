package com.example.lepszeduolingoserver.language;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/language")
public class LanguageResource implements SimpleResource<Language, LanguageDTO, Long> {

    private final LanguageService languageService;

    public LanguageResource(LanguageService languageService) {
        this.languageService = languageService;
    }

    @Override
    public CrudService<Language, LanguageDTO, Long> getService() {
        return languageService;
    }


//    LanguageRepository languageRepository;
//
//    public LanguageResource(LanguageRepository languageRepository) {
//        this.languageRepository = languageRepository;
//    }
//
//    @GetMapping
//    public List<Language> getAllLanguage() {
//        return languageRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Language> getLanguageById(@PathVariable Long id) {
//        return languageRepository.findById(id);
//    }
//
//    @PostMapping
//    public Language postLanguageBody(@Valid @RequestBody Language language) {
//        return languageRepository.save(language);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteLanguageById(@PathVariable Long id) {
//        languageRepository.deleteById(id);
//    }


}
