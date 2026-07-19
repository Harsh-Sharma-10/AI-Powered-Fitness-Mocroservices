package com.example.AIpowered_Application.Model;


import com.example.AIpowered_Application.Enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "Users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private  String firstname;
    private  String lastname;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    private LocalDate dateOfBirth;

    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;

    @NotNull
    @Pattern(regexp="^\\+?[0-9]{10,15}$")
    @Column(name = "phone_number")
    private String phoneNumber;

}
