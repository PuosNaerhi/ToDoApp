package com.PuosNaerhi.ToDoApp.domain.service;

import com.PuosNaerhi.ToDoApp.domain.entity.ToDoEntity;

import java.util.List;

/**
 * Created by Perttu Vanharanta on 28.9.2016.
 */
public interface ToDoService {

    public void createToDo(String ToDoString);
    public ToDoEntity readToDo(Integer id);
    public void updateToDo(Integer id, String ToDoString);
    public void deleteToDo(Integer id);
    public List<ToDoEntity> listToDo();
}
