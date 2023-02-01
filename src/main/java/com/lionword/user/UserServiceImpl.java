package com.lionword.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = repository.findAll();
        return users.stream()
                .map(UserDtoMapper::mapUserToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto saveUser(User user) {
        User savedUser = repository.save(user);
        return UserDtoMapper.mapUserToDto(savedUser);
    }
}