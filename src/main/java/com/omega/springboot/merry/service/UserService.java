package com.omega.springboot.merry.service;

import com.omega.springboot.merry.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
     List<User> getAllUsers();
     Optional<User> getUser(long id);
     User createUser(User user);
     User updateUser(User user);
     void deleteUser(long id);
}
