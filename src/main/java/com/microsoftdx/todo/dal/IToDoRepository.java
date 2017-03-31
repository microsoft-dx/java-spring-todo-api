package com.microsoftdx.todo.dal;

import com.microsoftdx.todo.models.ToDoItem;

import java.util.List;

/**
 * Created by radu on 3/31/17.
 */
public interface IToDoRepository {
    int getNextId();

    List<ToDoItem> getToDoItems();
    ToDoItem getToDoItemById(int id);
    void createToDoItem(ToDoItem toDoItem);
    void deleteToDoItem(int id);
    void updateToDoItem(ToDoItem toDoItem);
}
