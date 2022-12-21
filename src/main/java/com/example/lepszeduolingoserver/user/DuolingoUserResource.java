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

    @PostMapping("/auth")
    public DuolingoUserDTO postDuolingoUserBody(@RequestBody AuthCredentials authCredentials) {
        return duolingoUserService.auth(authCredentials.email(), authCredentials.hash());
    }

    @PostMapping
    public DuolingoUserDTO postDuolingoUserBody(@Valid @RequestBody DuolingoUser user) {
        return duolingoUserService.mapToDto(duolingoUserService.save(user));
    }

    @DeleteMapping("/{id}")
    public void deleteDuolingoUserById(@PathVariable Long id) {
        duolingoUserService.deleteById(id);
    }

}
