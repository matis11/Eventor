package com.eventor.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by pawelszudrowicz on 17.05.2017.
 */
@Entity
public class SearchEvent {
    @Id
    private String name;

    public SearchEvent() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
