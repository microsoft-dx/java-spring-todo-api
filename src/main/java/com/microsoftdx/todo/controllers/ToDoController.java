package com.microsoftdx.todo.controllers;

import com.microsoftdx.todo.dal.IToDoRepository;
import com.microsoftdx.todo.dal.InMemoryToDoRepository;
import com.microsoftdx.todo.dal.SqlServerToDoRepository;
import com.microsoftdx.todo.models.ToDoItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by radu on 3/31/17.
 */

@RestController
public class ToDoController {


    @RequestMapping(value = "/api/todo", method = RequestMethod.GET)
    @CrossOrigin
    public List<ToDoItem> getAll(){
        return null;
    }

    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.GET)
    @CrossOrigin
    public ToDoItem getById(@PathVariable("id") int id){
        return null;
    }

    @RequestMapping(value = "/api/todo", method = RequestMethod.POST)
    @CrossOrigin
    public ToDoItem create(@RequestBody ToDoItem item){
        return null;
    }

    @RequestMapping(value = "/api/todo", method = RequestMethod.PUT)
    @CrossOrigin
    public ToDoItem update(@RequestBody ToDoItem item){
        return null;
    }

    @RequestMapping(value = "/api/toDo/{id}", method = RequestMethod.DELETE)
    @CrossOrigin
    public ResponseEntity<HttpStatus> delete(@PathVariable int id){
        return null;
    }
}
