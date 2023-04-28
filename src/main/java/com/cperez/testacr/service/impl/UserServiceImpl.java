package com.cperez.testacr.service.impl;

import com.cperez.testacr.dto.UserDTO;
import com.cperez.testacr.model.User;
import com.cperez.testacr.repository.UserRepository;
import com.cperez.testacr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createdUser(UserDTO userDTO) {
        User user = new User(userDTO);
        return userRepository.save(user);
    }
}
