package com.cperez.testacr.controller;

import com.cperez.testacr.dto.UserDTO;
import com.cperez.testacr.model.User;
import com.cperez.testacr.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> finfAll() {
        try {
            List<User> users = userService.getUsers();
            return ResponseEntity.status(HttpStatus.OK).body(users);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping
    public ResponseEntity<User> createdUser(@RequestBody UserDTO userDTO) {
        try {
            User user = userService.createdUser(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

}
