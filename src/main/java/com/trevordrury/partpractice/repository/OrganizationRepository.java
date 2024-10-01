package com.trevordrury.partpractice.repository;

import com.trevordrury.partpractice.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
}
