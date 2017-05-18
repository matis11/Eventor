package com.eventor.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by pawelszudrowicz on 17.05.2017.
 */

/**
 * Basic entity for event searching. Annotated as default Spring model class.
 */
@Entity
public class SearchEvent {
    @Id
    private String name;

    public SearchEvent() {
        name = "";
    }

    /**
     * Public getter for event name.
     * @return eventName
     */
    public String getName() {
        return name;
    }


    /**
     * Create new searchEvent
     * @param name Eventname
     */
    public void setName(String name) {
        this.name = name;
    }
}
