package com.todo.todoapp.repository;

import com.todo.todoapp.model.TODOEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TODORepository extends JpaRepository<TODOEntity, String> {
}
