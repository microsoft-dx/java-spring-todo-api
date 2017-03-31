package com.microsoftdx.todo.dal;

import com.microsoftdx.todo.models.ToDoItem;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by radu on 4/1/17.
 */

public class SqlServerToDoRepository implements IToDoRepository {

    private DataSource _dataSource = this.getDataSource();

    private DataSource getDataSource() {
        return DataSourceBuilder
                .create()
                .url("CONNECTION STRING FOR JDBC FROM AZURE")
                .driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
                .build();
    }

    @Override
    public int getNextId() {
        return 0;
    }

    @Override
    public List<ToDoItem> getToDoItems() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(_dataSource);

        return jdbcTemplate.query("SELECT Id, Text, IsDone FROM ToDoItems", new BeanPropertyRowMapper(ToDoItem.class));
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
