package com.PuosNaerhi.ToDoApp.domain.service.impl;

import com.PuosNaerhi.ToDoApp.domain.entity.ToDoEntity;
import com.PuosNaerhi.ToDoApp.domain.repository.ToDoRepository;
import com.PuosNaerhi.ToDoApp.domain.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Perttu Vanhranta on 28.9.2016.
 */

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    ToDoRepository toDoRepository;

    @Transactional(readOnly = false)
    public void createToDo(String ToDoString) {
        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setToDoString(ToDoString);
        toDoRepository.createToDo(toDoEntity);
    }

    @Transactional(readOnly = true)
    public ToDoEntity readToDo(Integer id) {
        return toDoRepository.readToDo(id);
    }

    @Transactional(readOnly = false)
    public void updateToDo(Integer id, String ToDoString) {
        ToDoEntity toDoEntity = toDoRepository.readToDo(id);
        toDoEntity.setToDoString(ToDoString);
        toDoRepository.updateToDo(toDoEntity);
    }

    @Transactional(readOnly = false)
    public void deleteToDo(Integer id) {
        toDoRepository.deleteToDo(id);
    }

    @Transactional(readOnly = true)
    public List<ToDoEntity> listToDo() {
        return toDoRepository.listToDo();
    }
}
