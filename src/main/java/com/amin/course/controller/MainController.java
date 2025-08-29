package com.amin.course.controller;

import com.amin.course.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/api/main")
    public String mainListiner(){
        return "Hello World";
    }

    @GetMapping("/api/cat")
    public String giveCat(){
        User cat = new User("Barsik", 5, "orange", "Asmar");

        String jsonData = null;
        try {
            jsonData = objectMapper.writeValueAsString(cat);
        }catch (JsonProcessingException e){
            System.out.println("Не удалось добавить кота " + e.getMessage());
        }
        return  jsonData;
    }
    @PostMapping("/api/special")
    public String getSpecialCat(@RequestParam String name){
        User cat = new User(name, 5, "orange", "Asmar");

        String jsonData = null;
        try {
            jsonData = objectMapper.writeValueAsString(cat);
        }catch (JsonProcessingException e){
            System.out.println("Не удалось добавить кота " + e.getMessage());
        }
        return  jsonData;
    }
}

