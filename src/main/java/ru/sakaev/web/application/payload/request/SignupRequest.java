package ru.sakaev.web.application.payload.request;

import lombok.Data;
import ru.sakaev.web.application.annotations.PasswordMatches;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignupRequest {  // используем при попытке регистрации нового пользователя

    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
//    @ValidEmail
    private String email;
    @NotEmpty(message = "Please enter your firstname")
    private String firstname;
    @NotEmpty(message = "Please enter your lastname")
    private String lastname;
    @NotEmpty(message = "Please enter your username")
    private String username;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}
