package com.example.lepszeduolingoserver.difficulty;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/difficulty")
public class DifficultyResource implements SimpleResource<Difficulty, DifficultyDTO, Long> {

    private final DifficultyService difficultyService;

    public DifficultyResource(DifficultyService difficultyService) {
        this.difficultyService = difficultyService;
    }

    @Override
    public CrudService<Difficulty, DifficultyDTO, Long> getService() {
        return difficultyService;
    }


//    DifficultyRepository difficultyRepository;
//
//    public DifficultyResource(DifficultyRepository difficultyRepository) {
//        this.difficultyRepository = difficultyRepository;
//    }
//
//    @GetMapping
//    public List<Difficulty> getAllDifficulty() {
//        return difficultyRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Difficulty> getDifficultyById(@PathVariable Long id) {
//        return difficultyRepository.findById(id);
//    }
//
//    @PostMapping
//    public Difficulty postDifficultyBody(@Valid @RequestBody Difficulty difficulty) {
//        return difficultyRepository.save(difficulty);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteDifficultyById(@PathVariable Long id) {
//        difficultyRepository.deleteById(id);
//    }
//
}
