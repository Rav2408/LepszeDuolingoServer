package com.example.lepszeduolingoserver.collection;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/collection")
public class CollectionResource {
    
    CollectionRepository collectionRepository;

    public CollectionResource(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @GetMapping
    public List<Collection> getAllCollection() {
        return collectionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Collection> getCollectionById(@PathVariable Long id) {
        return collectionRepository.findById(id);
    }

    @PostMapping
    public Collection postCollectionBody(@Valid @RequestBody Collection collection) {
        return collectionRepository.save(collection);
    }

    @DeleteMapping("/{id}")
    public void deleteCollectionById(@PathVariable Long id) {
        collectionRepository.deleteById(id);
    }

}
