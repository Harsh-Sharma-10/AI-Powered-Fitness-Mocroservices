package com.example.AIpowered_Application.Dto;


import com.example.AIpowered_Application.Dto.Validators.CreateUserValidationGroup;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequests {

    @NotBlank(groups = CreateUserValidationGroup.class,message = "First name is required !!")
    @Size(min = 3, max = 100,message = "name is not more than 100 chars !!")
    private String firstName;

    @Size(min = 3, max = 100,message = "last name is not more than 100 chars !!")
    private String lastName;

    @NotBlank(groups = CreateUserValidationGroup.class,message = "Email is required !! ")
    @Email(message = "Email is required !!")
    private String email;

    @NotBlank(groups = CreateUserValidationGroup.class,message = "Password is required !!")
    @Size(min = 8,max = 43)
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$",
            message = "Password must contain uppercase, lowercase and digit."
    )
    private String password;

    @NotNull(message = "Date of birth is required !!")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\+?[0-9]{10,15}$",
            message = "Invalid phone number")
    private String phoneNumber;


}
