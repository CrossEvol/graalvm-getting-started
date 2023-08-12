package com.crossevol.demo.graalvm.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author omf
 * @create 2023-08-12 16:16
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "get all users";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        return "get user with id: " + id;
    }

    @PostMapping
    public String createUser() {
        return "create a new user";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id) {
        return "update user with id: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "delete user with id: " + id;
    }

}