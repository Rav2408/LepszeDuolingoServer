package com.example.lepszeduolingoserver.difficulty;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/difficulty")
public class DifficultyResource {
    DifficultyRepository difficultyRepository;

    public DifficultyResource(DifficultyRepository difficultyRepository) {
        this.difficultyRepository = difficultyRepository;
    }

    @GetMapping
    public List<Difficulty> getAllDifficulty() {
        return difficultyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Difficulty> getDifficultyById(@PathVariable Long id) {
        return difficultyRepository.findById(id);
    }

    @PostMapping
    public Difficulty postDifficultyBody(@Valid @RequestBody Difficulty difficulty) {
        return difficultyRepository.save(difficulty);
    }

    @DeleteMapping("/{id}")
    public void deleteDifficultyById(@PathVariable Long id) {
        difficultyRepository.deleteById(id);
    }
    
}
