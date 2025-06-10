package com.todo.todoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TODOItem {
    private String id;
    private String name;
}
