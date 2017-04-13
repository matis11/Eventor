package com.eventor.model.repository;

import com.eventor.model.entity.Event;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

/**
 * Event Repository for CRUD operations.
 */
public interface EventRepository extends CrudRepository<Event, Long> {

}