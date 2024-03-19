package ru.dolgosheev.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.dolgosheev.spring.model.User;
import ru.dolgosheev.spring.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private final UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String index() {
        return null;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create() {
        return null;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@Valid @RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User show(@PathVariable Long id) {
        var user = userRepository.findById(id).get();
        return user;
    }
}
