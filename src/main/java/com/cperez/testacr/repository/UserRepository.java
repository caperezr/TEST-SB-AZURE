package com.cperez.testacr.repository;

import com.cperez.testacr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
