package com.springboot.coder_singh.coder_singh.controller;
import com.springboot.coder_singh.coder_singh.model.TodoItem;
import com.springboot.coder_singh.coder_singh.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoRepo> FindAll(){
        return todoRepo.findAll();
    }

//    @PostMapping
//    public TodoItem save(@NonNull @RequestBody TodoItem todoItem){
//        return todoRepo.save(todoItem);
//    }
}
