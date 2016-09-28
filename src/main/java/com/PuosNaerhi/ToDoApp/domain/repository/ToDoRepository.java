package com.PuosNaerhi.ToDoApp.domain.repository;

import com.PuosNaerhi.ToDoApp.domain.entity.ToDoEntity;

import java.util.List;

/**
 * Created by Perttu Vanharanta on 28.9.2016.
 */

public interface ToDoRepository {

    public void createToDo(ToDoEntity toDoEntity);
    public ToDoEntity readToDo(Integer id);
    public void updateToDo(ToDoEntity toDoEntity);
    public void deleteToDo(Integer id);
    public List<ToDoEntity> listToDo();
}
