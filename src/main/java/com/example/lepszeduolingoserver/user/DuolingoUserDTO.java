package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;

public class DuolingoUserDTO implements Identifiable<Long> {

    private Long id;
    private String name;
    private String email;
    private String role;
    private byte[] salt;
    private byte[] hash;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
