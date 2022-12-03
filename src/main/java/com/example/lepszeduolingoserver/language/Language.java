package com.example.lepszeduolingoserver.language;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Language {

    @Id
    @SequenceGenerator(name = "example_sequence", sequenceName = "example_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "example_sequence")
    private Long id;

    @NotNull
    private String name;

    public Language(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Language() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
