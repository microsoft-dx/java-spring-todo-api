package com.microsoftdx.todo.dal;

import com.microsoftdx.todo.models.ToDoItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radu on 3/31/17.
 */
public class InMemoryToDoRepository implements IToDoRepository {

    private List<ToDoItem> _toDoList;

    public InMemoryToDoRepository() {
        _toDoList = new ArrayList<>();

        _toDoList.add(new ToDoItem(1, "Learn .NET", true));
        _toDoList.add(new ToDoItem(2, "Learn Java", true));
        _toDoList.add(new ToDoItem(3, "Learn JavaScript", true));
    }

    @Override
    public int getNextId() {
        return _toDoList.size() + 1;
    }

    @Override
    public List<ToDoItem> getToDoItems() {
        return _toDoList;
    }

    @Override
    public ToDoItem getToDoItemById(int id) {
        return null;
    }

    @Override
    public void createToDoItem(ToDoItem toDoItem) {

    }

    @Override
    public void deleteToDoItem(int id) {

    }

    @Override
    public void updateToDoItem(ToDoItem toDoItem) {
        
    }
}
