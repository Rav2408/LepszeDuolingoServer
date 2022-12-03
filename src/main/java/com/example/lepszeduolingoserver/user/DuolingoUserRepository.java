package com.example.lepszeduolingoserver.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuolingoUserRepository extends JpaRepository<DuolingoUser, Long> {
}
