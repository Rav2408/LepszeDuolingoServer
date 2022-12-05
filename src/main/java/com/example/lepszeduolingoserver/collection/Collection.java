package com.example.lepszeduolingoserver.collection;

import com.example.lepszeduolingoserver.category.Category;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import jakarta.persistence.*;

@Entity
@Table
public class Collection implements Identifiable<Long> {

    @Id
    @SequenceGenerator(name = "collection_sequence", sequenceName = "collection_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "collection_sequence")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    public Collection(Long id, Category category) {
        this.id = id;
        this.category = category;
    }

    public Collection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
