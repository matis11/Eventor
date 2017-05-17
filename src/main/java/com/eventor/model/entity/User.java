package com.eventor.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Basic entity for event handling. Annotated as default Spring model class.
 */

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;

    /**
     * Create new user
     * @param name User name
     * @param password Password
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
        this.name = "";
        this.password = "";
    }

    /**
     * Unique user Id
     * @return user Id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * User name
     * @return User name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * User password description
     * @return password description
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}