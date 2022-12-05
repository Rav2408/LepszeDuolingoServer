package com.example.lepszeduolingoserver.collection;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/collection")
public class CollectionResource implements SimpleResource<Collection, CollectionDTO, Long> {

    private final CollectionService collectionService;

    public CollectionResource(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @Override
    public CrudService<Collection, CollectionDTO, Long> getService() {
        return collectionService;
    }

//    CollectionRepository collectionRepository;
//
//    public CollectionResource(CollectionRepository collectionRepository) {
//        this.collectionRepository = collectionRepository;
//    }
//
//    @GetMapping
//    public List<Collection> getAllCollection() {
//        return collectionRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Collection> getCollectionById(@PathVariable Long id) {
//        return collectionRepository.findById(id);
//    }
//
//    @PostMapping
//    public Collection postCollectionBody(@Valid @RequestBody Collection collection) {
//        return collectionRepository.save(collection);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteCollectionById(@PathVariable Long id) {
//        collectionRepository.deleteById(id);
//    }

}
