package org.example.task313.Service;

import org.example.task313.Model.Role;

import java.util.List;

public interface RolesService {
    Role addNewRole(Role role);

    void deleteRole(Role role);

    List<Role> getAllRoles();
}
