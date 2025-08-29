package com.amin.course.controller;

import com.amin.course.DTO.AuthDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/auth")
    public String auth(@RequestBody AuthDTO authDTO) {
        return null;

    }
}
