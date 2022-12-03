package com.example.lepszeduolingoserver.difficulty;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Difficulty {

    @Id
    @SequenceGenerator(name = "example_sequence", sequenceName = "example_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "example_sequence")
    private Long id;

    @NotNull
    private String level;

    public Difficulty(Long id, String level) {
        this.id = id;
        this.level = level;
    }

    public Difficulty() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
