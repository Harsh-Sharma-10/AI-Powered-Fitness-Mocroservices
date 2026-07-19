package com.example.AIpowered_Application.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "User_Logs_Table")
@Data
@Entity
public class User_Logs {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String originalid;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private LocalDate dateofbirth;
    private String phone;

}
