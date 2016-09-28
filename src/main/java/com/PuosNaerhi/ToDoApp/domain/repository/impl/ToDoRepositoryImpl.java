package com.PuosNaerhi.ToDoApp.domain.repository.impl;

import com.PuosNaerhi.ToDoApp.domain.entity.ToDoEntity;
import com.PuosNaerhi.ToDoApp.domain.repository.ToDoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Perttu Vanharanta on 28.9.2016.
 */

@Repository
public class ToDoRepositoryImpl implements ToDoRepository {

    @PersistenceContext
    EntityManager em;

    public void createToDo(ToDoEntity toDoEntity) {
        em.persist(toDoEntity);
    }

    public ToDoEntity readToDo(Integer id) {
        ToDoEntity toDoEntity = null;
        if(checkIsIdExist(id)){
            toDoEntity = em.find(ToDoEntity.class,id);
        }
        return toDoEntity;
    }

    public void updateToDo(ToDoEntity toDoEntity) {
        em.merge(toDoEntity);
    }

    public void deleteToDo(Integer id) {
        ToDoEntity toDoEntity = readToDo(id);
        if(toDoEntity != null) {
            em.remove(toDoEntity);
        }
    }

    public List<ToDoEntity> listToDo() {
        List<ToDoEntity> list =  em.createQuery("FROM ToDoEntity ToDoE").getResultList();
        return list;
    }

    private boolean checkIsIdExist(Integer id){
        List<ToDoEntity> list = em.createQuery("FROM ToDoEntity td WHERE td.id=:id")
                .setParameter("id",id)
                .getResultList();
        if(!list.isEmpty())
        {
            return true;
        }
        return false;
    }

}
