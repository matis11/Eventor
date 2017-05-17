package com.eventor.model.repository;

import com.eventor.model.entity.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

/**
 * User Repository for CRUD operations.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}