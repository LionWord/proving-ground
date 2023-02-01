package com.lionword.user;

import java.time.format.DateTimeFormatter;

public class UserDtoMapper {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd|hh:mm:ss");
    static UserDto mapUserToDto(User user) {
        return UserDto.builder()
                .email(user.getEmail())
                .fullName(user.getFirstName() + " " + user.getLastName())
                .registrationDate(formatter.format(user.getRegistrationDate()))
                .build();
    }

}
