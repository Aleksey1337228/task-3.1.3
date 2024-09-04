package org.example.task313.Service;

import org.example.task313.Model.AddRequest;
import org.example.task313.Model.Role;
import org.example.task313.Model.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserService {
    User addUser(AddRequest addRequest);

    void delete(User user);

    Optional<User> findById(int id);

    List<User> getAll();

    void deleteUserById(int id);

    User findUserById(int id);

    Set<Role> getRole(Set<String> rolesId);
}
