package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;

public class DuolingoUserDTO implements Identifiable<Long> {
    private Long id;

    private String name;

    private String role;

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

    @Override
    public String toString() {
        return "DuolingoUserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
