package com.example.lepszeduolingoserver.collection;

import com.example.lepszeduolingoserver.category.Category;
import com.example.lepszeduolingoserver.category.CategoryDTO;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;

public class CollectionDTO implements Identifiable<Long> {

    private Long id;
    private CategoryDTO category;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CollectionDTO{" +
                "id=" + id +
                ", category=" + category +
                '}';
    }
}
