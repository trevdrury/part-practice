package com.trevordrury.partpractice.repository;

import com.trevordrury.partpractice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
