package com.omega.springboot.merry.service;

import com.omega.springboot.merry.entity.User;
import com.omega.springboot.merry.so.UserSO;

import java.util.List;
import java.util.Optional;

public interface UserService {
     List<UserSO> getAllUsers();
     Optional<UserSO> getUser(long id);
     UserSO createUser(UserSO user);
     UserSO updateUser(UserSO user);
     void deleteUser(long id);
}
