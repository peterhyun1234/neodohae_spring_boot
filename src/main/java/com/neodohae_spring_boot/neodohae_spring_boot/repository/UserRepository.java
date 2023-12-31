package com.neodohae_spring_boot.neodohae_spring_boot.repository;

import com.neodohae_spring_boot.neodohae_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    // Optional<User> findByUsernameOrEmail(String username, String email);

    // Optional<User> findByUsername(String username);

    // Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    List<User> findByRoomId(Integer roomId);
}
