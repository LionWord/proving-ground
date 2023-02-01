package com.lionword.user;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    @Transactional(isolation = Isolation.READ_COMMITTED, readOnly = true)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
    @Transactional
    @PostMapping
    public UserDto saveNewUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}