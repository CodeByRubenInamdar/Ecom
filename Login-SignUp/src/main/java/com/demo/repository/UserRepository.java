package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // To find a user by email
}
