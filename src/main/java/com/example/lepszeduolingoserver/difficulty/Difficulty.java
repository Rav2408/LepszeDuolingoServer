package com.example.lepszeduolingoserver.difficulty;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table
public class Difficulty implements Identifiable<Long> {

    @Id
    @SequenceGenerator(name = "difficulty_sequence", sequenceName = "difficulty_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "difficulty_sequence")
    private Long id;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Difficulty)) return false;
        Difficulty that = (Difficulty) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getLevel(), that.getLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLevel());
    }
}
