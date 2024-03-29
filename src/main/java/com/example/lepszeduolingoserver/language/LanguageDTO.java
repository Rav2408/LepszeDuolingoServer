package com.example.lepszeduolingoserver.language;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;

public class LanguageDTO implements Identifiable<Long> {

    private Long id;

    private String name;

    public LanguageDTO() {
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

    @Override
    public String toString() {
        return "LanguageDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
