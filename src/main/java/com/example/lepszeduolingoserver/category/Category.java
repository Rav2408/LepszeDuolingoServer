package com.example.lepszeduolingoserver.category;

import com.example.lepszeduolingoserver.difficulty.Difficulty;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import jakarta.persistence.*;

@Entity
@Table
public class Category implements Identifiable<Long> {
    @Id
    @SequenceGenerator(name = "category_sequence", sequenceName = "category_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "difficulty_id")
    private Difficulty difficulty;

    public Category(Long id, String name, Difficulty difficulty) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
    }

    public Category() {
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

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}
