package com.example.lepszeduolingoserver.user;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import jakarta.persistence.*;

@Entity
@Table
public class DuolingoUser implements Identifiable<Long> {
    @Id
    @SequenceGenerator(name = "duolingo_user_sequence", sequenceName = "duolingo_user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "duolingo_user_sequence")
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
