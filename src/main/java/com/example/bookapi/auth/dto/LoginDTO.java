package com.example.bookapi.auth.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String username;
    private String password;
}