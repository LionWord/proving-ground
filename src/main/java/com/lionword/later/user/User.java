package com.lionword.later.user;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Email
    @Length(max = 64)
    @Column(name = "email", nullable = false)
    private String email;

    @NotBlank
    @Length(max = 64)
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank
    @Length(max = 64)
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "registration_date")
    private Instant registrationDate = Instant.now();
    @Enumerated(EnumType.STRING)
    private UserState state;

    public enum UserState {
        ACTIVE, BLOCKED, DELETED
    }
}
