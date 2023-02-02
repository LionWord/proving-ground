package com.lionword.later.user;

import java.util.List;

interface UserService {
    List<UserDto> getAllUsers();

    UserDto saveUser(User user);
}