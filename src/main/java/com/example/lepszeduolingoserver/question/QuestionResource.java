package com.example.lepszeduolingoserver.question;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class QuestionResource implements SimpleResource<Question, QuestionDTO, Long> {
    private final QuestionService questionService;

    public QuestionResource(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public CrudService<Question, QuestionDTO, Long> getService() {
        return questionService;
    }
}
