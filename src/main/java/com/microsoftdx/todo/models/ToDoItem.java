package com.microsoftdx.todo.models;

/**
 * Created by radu on 3/31/17.
 */
public class ToDoItem {
    private int id;
    private String text;
    private boolean isDone;

    public ToDoItem(int id, String text, boolean isDone) {
        this.id = id;
        this.text = text;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void UpdateToDoItem(ToDoItem toDoItem) {
        this.setText(toDoItem.getText());
        this.setDone(toDoItem.isDone());
    }
}
