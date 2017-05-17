package com.eventor.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Basic entity for event handling. Annotated as default Spring model class.
 */

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Integer level;
    private Integer seatsNumber;

    /**
     * Create new event
     * @param name Event name
     * @param description Event description
     */
    public Event(String name, String description, Integer level, Integer seatsNumber) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.seatsNumber = seatsNumber;
    }

    /**
     * Unique event Id
     * @return Event Id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Event name
     * @return Event name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Event description
     * @return Event description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Event level
     * @return Event level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * Seats number on event
     * @return Seats number on event
     */
    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(Integer seatsNumber) {
        this.seatsNumber = seatsNumber;
    }
}