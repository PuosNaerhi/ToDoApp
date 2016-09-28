package com.PuosNaerhi.ToDoApp.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Perttu Vanharanta on 28.9.2016.
 */
@Entity
public class ToDoEntity {

    @Id
    @GeneratedValue
    Integer id;

    String toDoString;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToDoString() {
        return toDoString;
    }

    public void setToDoString(String toDoString) {
        this.toDoString = toDoString;
    }
}
