package com.example.lepszeduolingoserver.language;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/language")
public class LanguageResource {
    
    LanguageRepository languageRepository;

    public LanguageResource(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    
    @GetMapping
    public List<Language> getAllLanguage() {
        return languageRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Language> getLanguageById(@PathVariable Long id) {
        return languageRepository.findById(id);
    }

    @PostMapping
    public Language postLanguageBody(@Valid @RequestBody Language language) {
        return languageRepository.save(language);
    }

    @DeleteMapping("/{id}")
    public void deleteLanguageById(@PathVariable Long id) {
        languageRepository.deleteById(id);
    }


}
