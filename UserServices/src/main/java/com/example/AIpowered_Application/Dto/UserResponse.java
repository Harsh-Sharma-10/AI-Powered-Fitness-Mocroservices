package com.example.AIpowered_Application.Dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class UserResponse { /// Response Dto

    private  String id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  LocalDate dateOfBirth;
    private  String phoneNumber;


}
