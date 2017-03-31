package com.microsoftdx.todo.dal;


import com.microsoftdx.todo.models.ToDoItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by radu on 4/1/17.
 */
public class ToDoItemRowMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        ToDoItem toDoItem = new ToDoItem();

        toDoItem.setId(resultSet.getInt("Id"));
        toDoItem.setText(resultSet.getString("Text"));
        toDoItem.setDone(resultSet.getBoolean("IsDone"));

        return toDoItem;
    }
}
