package com.example.lepszeduolingoserver.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DuolingoUserRepository extends JpaRepository<DuolingoUser, Long> {

    boolean existsByEmail(String email);
    Optional<DuolingoUser> findByEmail(String email);
}
