package ru.sakaev.web.application.payload.response;

import lombok.Getter;

@Getter
public class InvalidLoginResponse { // Создаем объект при возникнавении ошибки 401

    private String username;
    private String password;

    public InvalidLoginResponse() {
        this.username = "Invalid Username";
        this.password = "Invalid Password";
    }

}
