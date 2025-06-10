package com.todo.todoapp.service.impl;

import com.todo.todoapp.advice.BadRequestException;
import com.todo.todoapp.dto.TODOItem;
import com.todo.todoapp.model.TODOEntity;
import com.todo.todoapp.repository.TODORepository;
import com.todo.todoapp.service.TODOService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TODOServiceImpl implements TODOService {

    private final TODORepository todoRepository;

    @Override
    public void createTODOItem(TODOItem todoItem) {
        if (todoRepository.existsById(todoItem.getId())) {
            throw new BadRequestException("TODO already exist, consider updating.");
        }

        TODOEntity todoEntity = new TODOEntity(todoItem.getId(), todoItem.getName());
        todoRepository.save(todoEntity);
    }

    @Override
    public List<TODOItem> getAllTODOItems() {
        return todoRepository.findAll()
                .stream()
                .map(todoEntity -> new TODOItem(todoEntity.getId(), todoEntity.getName()))
                .toList();
    }

    @Override
    public TODOItem updateTodoItem(String id, String name) {
        TODOEntity todoEntity = todoRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("TODO item not found"));

        todoEntity.setName(name);
        todoRepository.save(todoEntity);

        return new TODOItem(todoEntity.getId(), todoEntity.getName());
    }

    @Override
    public void deleteTodoItem(String id) {
        if (!todoRepository.existsById(id)) {
            throw new BadRequestException("TODO item not found");
        }
        todoRepository.deleteById(id);
    }
}
