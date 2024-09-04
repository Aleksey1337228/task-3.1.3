package org.example.task313.Repository;

import org.example.task313.Model.Role;
import org.example.task313.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Role getRoleById(int id);

    Optional<User> findByName(String name);
}
