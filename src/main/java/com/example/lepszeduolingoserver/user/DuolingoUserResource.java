package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.SimpleResource;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/duolingouser")
public class DuolingoUserResource{

    private final DuolingoUserService duolingoUserService;

    public DuolingoUserResource(DuolingoUserService duolingoUserService) {
        this.duolingoUserService = duolingoUserService;
    }

//    @GetMapping
//    public List<String> getAllEmails() {
//        return duolingoUserService.findAll();
//    }

    @GetMapping("/{id}")
    public Optional<DuolingoUser> getUserById(@PathVariable Long id) {
        return duolingoUserService.findById(id);
    }

    @GetMapping("/get/{email}")
    public DuolingoUserDTO getUserByEmail(@PathVariable String email) {
        return duolingoUserService.getUserByEmail(email);
    }

    @GetMapping
    public boolean isUserExists(@RequestParam String email) {
        return duolingoUserService.existsByEmail(email);
    }

    @GetMapping("/salt")
    public String findUserSaltByEmail(@RequestParam String email) {
        return duolingoUserService.findUserSaltByEmail(email);
    }

    @PostMapping
    public DuolingoUser postDuolingoUserBody(@Valid @RequestBody DuolingoUser user) {
        return duolingoUserService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteDuolingoUserById(@PathVariable Long id) {
        duolingoUserService.deleteById(id);
    }

}
