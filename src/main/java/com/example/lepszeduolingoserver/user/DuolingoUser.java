package com.example.lepszeduolingoserver.user;

import jakarta.persistence.*;

@Entity
@Table
public class DuolingoUser {
    @Id
    @SequenceGenerator(name = "example_sequence", sequenceName = "example_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "example_sequence")
    private Long id;

    private String name;

    private String role;

    public DuolingoUser(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public DuolingoUser() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
