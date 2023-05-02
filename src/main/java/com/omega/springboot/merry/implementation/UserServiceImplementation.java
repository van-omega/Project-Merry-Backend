package com.omega.springboot.merry.implementation;

import com.omega.springboot.merry.entity.User;
import com.omega.springboot.merry.repository.UserRepository;
import com.omega.springboot.merry.service.UserService;
import com.omega.springboot.merry.so.UserSO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserSO> getAllUsers() {
        return userRepository.findAll().stream().map(user -> modelMapper.map(user, UserSO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserSO> getUser(long id) {
        Optional<User> user = userRepository.findById(id);
        UserSO userSO = modelMapper.map(user.get(), UserSO.class);
        return Optional.ofNullable(userSO);
    }

    @Override
    @Transactional
    public UserSO createUser(UserSO userSO) {
        User user = modelMapper.map(userSO, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserSO.class);
    }

    @Override
    @Transactional
    public UserSO updateUser(UserSO userSO) {
        User user = modelMapper.map(userSO, User.class);
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserSO.class);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
