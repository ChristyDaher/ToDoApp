package com.todo.todoapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TODO_ENTITY")
public class TODOEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;
}
