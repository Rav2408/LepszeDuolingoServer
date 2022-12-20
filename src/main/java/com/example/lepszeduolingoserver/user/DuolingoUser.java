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

    private String email;
    private String role;

    private String salt;

    private String hash;

    public DuolingoUser(Long id, String name, String email, String role, String salt, String hash) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.salt = salt;
        this.hash = hash;
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
}
