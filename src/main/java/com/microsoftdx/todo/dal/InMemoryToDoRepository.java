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
        for(ToDoItem toDoItem : _toDoList)
            if(toDoItem.getId() == id)
                return toDoItem;

        return null;
    }

    @Override
    public void createToDoItem(ToDoItem toDoItem) {
        toDoItem.setId(this.getNextId());
        _toDoList.add(toDoItem);
    }

    @Override
    public void deleteToDoItem(int id) {
        ToDoItem toDoItemToDelete= null;

        for(ToDoItem t : _toDoList) {
            if(t.getId() == id)
                toDoItemToDelete = t;
        }

        if(toDoItemToDelete != null)
            _toDoList.remove(toDoItemToDelete);
    }

    @Override
    public void updateToDoItem(ToDoItem toDoItem) {

        ToDoItem toDoItemToUpdate = null;

        for(ToDoItem t : _toDoList){
            if(t.getId() == toDoItem.getId())
                toDoItemToUpdate = t;
        }

        if(toDoItemToUpdate != null)
            toDoItemToUpdate.UpdateToDoItem(toDoItem);
    }
}
