package com.lionword.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
@Data
@Builder(access = AccessLevel.PUBLIC)
public class UserDto {
    private String email;
    private String fullName;
    private String registrationDate;
}
