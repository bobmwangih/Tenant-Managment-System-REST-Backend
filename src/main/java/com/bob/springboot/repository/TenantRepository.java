package com.bob.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bob.springboot.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {

}
