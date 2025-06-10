package com.todo.todoapp.controller;

import com.todo.todoapp.dto.TODOItem;
import com.todo.todoapp.service.TODOService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TODOController {

    private final TODOService todoService;

    @PostMapping
    public ResponseEntity<TODOItem> createTODOItem(TODOItem todoItem) {
        todoService.createTODOItem(todoItem);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<TODOItem>> getAllTODOItems() {
        return ResponseEntity.ok(
                todoService.getAllTODOItems()
        );
    }

    @PutMapping
    public ResponseEntity<TODOItem> updateTODOItem(@RequestParam String id, @RequestParam String name) {
        return ResponseEntity.ok(
                todoService.updateTodoItem(id, name)
        );
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteItem(@RequestParam String id){
        todoService.deleteTodoItem(id);

        return ResponseEntity.ok().build();
    }

}
