package com.todo.todoapp.service;

import com.todo.todoapp.dto.TODOItem;

import java.util.List;

public interface TODOService {
    void createTODOItem(TODOItem todoItem);

    List<TODOItem> getAllTODOItems();

    TODOItem updateTodoItem(String id, String name);

    void deleteTodoItem(String id);
}
