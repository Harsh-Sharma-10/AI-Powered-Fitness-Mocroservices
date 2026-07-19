package com.example.AIpowered_Application.Mapper;

import com.example.AIpowered_Application.Dto.UserRequests;
import com.example.AIpowered_Application.Dto.UserResponse;
import com.example.AIpowered_Application.Model.User;

import java.time.LocalDateTime;

public class UserMapperDtos {

    public static UserResponse responseDto(User user) {
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setFirstName(user.getFirstname());
        response.setLastName(user.getLastname());
        response.setEmail(user.getEmail());
        response.setDateOfBirth(user.getDateOfBirth());
        response.setPhoneNumber(user.getPhoneNumber());

        return response;


    }

    public static User requestDto(UserRequests userRequest) {
         User user = new User();
         user.setFirstname(userRequest.getFirstName());
         user.setLastname(userRequest.getLastName());
         user.setEmail(userRequest.getEmail());
         user.setPassword(userRequest.getPassword());
         user.setDateOfBirth(userRequest.getDateOfBirth());
         user.setPhoneNumber(userRequest.getPhoneNumber());
         user.setCreated(LocalDateTime.now());

         return user;

    }
}
