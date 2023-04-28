package com.cperez.testacr.service;

import com.cperez.testacr.dto.UserDTO;
import com.cperez.testacr.model.User;

import java.util.List;


public interface UserService {
    List<User> getUsers();
    User createdUser(UserDTO user);
}
