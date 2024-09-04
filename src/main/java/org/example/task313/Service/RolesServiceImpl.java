package org.example.task313.Service;

import org.example.task313.Model.Role;
import org.example.task313.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {
    private final RoleRepository roleRepository;

    @Autowired
    public RolesServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public void deleteRole(Role role) {
        roleRepository.deleteById(role.getId());
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
