package ru.dolgosheev.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.dolgosheev.spring.model.User;

@RestController
@RequestMapping("/api")
public class UsersController {

    @GetMapping("/users")
    public String index() {
        return null;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create() {
        return null;
    }
}
