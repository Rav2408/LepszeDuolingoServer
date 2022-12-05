package com.example.lepszeduolingoserver.score;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import com.example.lepszeduolingoserver.word.Word;
import com.example.lepszeduolingoserver.word.WordDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/score")
public class ScoreResource implements SimpleResource<Score, ScoreDTO, Long> {

    private final ScoreService scoreService;

    public ScoreResource(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @Override
    public CrudService<Score, ScoreDTO, Long> getService() {
        return scoreService;
    }
}
