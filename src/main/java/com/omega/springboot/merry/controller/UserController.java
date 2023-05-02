package com.omega.springboot.merry.controller;

import com.omega.springboot.merry.service.UserService;
import com.omega.springboot.merry.so.UserSO;
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
    public List<UserSO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserSO>> getCustomerById(@PathVariable(value = "id") Long userId) {
        return ResponseEntity.ok().body(userService.getUser(userId));
    }

    @PostMapping("/")
    public UserSO createUser(@RequestBody UserSO customer) {
        return userService.createUser(customer);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserSO> updateCustomer(@RequestBody UserSO customer) {
        return ResponseEntity.ok().body(userService.updateUser(customer));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UserSO> deleteCustomer(@PathVariable(value = "id") Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }
}
