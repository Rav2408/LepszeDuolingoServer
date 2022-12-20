package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;

public class DuolingoUserDTO implements Identifiable<Long> {

    private Long id;
    private String name;
    private String email;
    private String role;
    private String salt;
    private String hash;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "DuolingoUserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", salt='" + salt + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }
}
