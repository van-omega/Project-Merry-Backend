package com.omega.springboot.merry.controller;

import com.omega.springboot.merry.entity.User;
import com.omega.springboot.merry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getCustomerById(@PathVariable(value = "id") Long userId) {
        return ResponseEntity.ok().body(userService.getUser(userId));
    }

    @PostMapping("/")
    public User createUser(@RequestBody User customer) {
        return userService.createUser(customer);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateCustomer(@RequestBody User customer) {
        return ResponseEntity.ok().body(userService.updateUser(customer));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> deleteCustomer(@PathVariable(value = "id") Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }
}
