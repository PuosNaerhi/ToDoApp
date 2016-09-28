package com.PuosNaerhi.ToDoApp.controller;

import com.PuosNaerhi.ToDoApp.domain.entity.ToDoEntity;
import com.PuosNaerhi.ToDoApp.domain.service.ToDoService;
import com.PuosNaerhi.ToDoApp.web.ToDoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Perttu Vanharanta on 28.9.2016.
 */

@Controller
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @RequestMapping(value = {"", "/", "/home"})
    public String home(Model model) {

        model.addAttribute("ToDoObjects",toDoService.listToDo());
        return "/home";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createToDoGet(Model model){

        return "/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createToDoPost(@ModelAttribute("ToDoObject")ToDoForm toDoForm, Model model){
        toDoService.createToDo(toDoForm.getToDoString());
        return "redirect:/home";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateToDoGet(@PathVariable("id") Integer id, Model model){
        ToDoEntity toDoEntity = toDoService.readToDo(id);
        if(toDoEntity != null) {
            model.addAttribute("ToDoObject", toDoService.readToDo(id));
            return "/update";
        }else{
            return "redirect:/home";
        }
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateToDoPost(@PathVariable("id") Integer id, @ModelAttribute("ToDoObject")ToDoForm toDoForm, Model model) {
        toDoService.updateToDo(id, toDoForm.getToDoString());
        return "redirect:/home";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteToDoGet(@PathVariable("id") Integer id, Model model){
        toDoService.deleteToDo(id);
        return "redirect:/home";
    }

}
