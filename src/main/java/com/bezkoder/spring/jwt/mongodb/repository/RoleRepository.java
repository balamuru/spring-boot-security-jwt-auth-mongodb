package com.bezkoder.spring.jwt.mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.jwt.mongodb.data.models.RoleType;
import com.bezkoder.spring.jwt.mongodb.data.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(RoleType name);
}
