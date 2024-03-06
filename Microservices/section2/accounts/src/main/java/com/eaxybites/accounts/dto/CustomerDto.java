package com.eaxybites.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5,max = 30, message = "Name should be within 5 and 30 characters")
    private String name;

    @Email(message = "Email address should be valid")
    @NotEmpty(message = "email cannot be empty")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile Number must be 10 digits.")
    @NotEmpty(message = "Mobile Number cannot be empty")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
