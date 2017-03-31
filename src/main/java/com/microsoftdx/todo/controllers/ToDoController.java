package com.microsoftdx.todo.controllers;

import com.microsoftdx.todo.dal.IToDoRepository;
import com.microsoftdx.todo.dal.InMemoryToDoRepository;
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
    private IToDoRepository _toDoRepository = new InMemoryToDoRepository();


    @RequestMapping(value = "/api/todo", method = RequestMethod.GET)
    @CrossOrigin
    public List<ToDoItem> getAll(){
        return _toDoRepository.getToDoItems();
    }

    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.GET)
    @CrossOrigin
    public ToDoItem getById(@PathVariable("id") int id){
        return _toDoRepository.getToDoItemById(id);
    }

    @RequestMapping(value = "/api/todo", method = RequestMethod.POST)
    @CrossOrigin
    public ToDoItem create(@RequestBody ToDoItem item){
        _toDoRepository.createToDoItem(item);

        return item;
    }

    @RequestMapping(value = "/api/todo", method = RequestMethod.PUT)
    @CrossOrigin
    public ToDoItem update(@RequestBody ToDoItem item){
        _toDoRepository.updateToDoItem(item);

        return item;
    }

    @RequestMapping(value = "/api/toDo/{id}", method = RequestMethod.DELETE)
    @CrossOrigin
    public ResponseEntity<HttpStatus> delete(@PathVariable int id){
        _toDoRepository.deleteToDoItem(id);

        return new ResponseEntity(HttpStatus.OK);
    }
}
