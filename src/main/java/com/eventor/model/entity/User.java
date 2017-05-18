package com.eventor.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Basic entity for user handling. Annotated as default Spring model class.
 */

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;
    //private List events = new ArrayList();




    /**
     * Create new user
     * @param name User name
     * @param password Password
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        //events = new ArrayList<>();
    }

    public User() {
        this.name = "";
        this.password = "";
        //events = new ArrayList<>();
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