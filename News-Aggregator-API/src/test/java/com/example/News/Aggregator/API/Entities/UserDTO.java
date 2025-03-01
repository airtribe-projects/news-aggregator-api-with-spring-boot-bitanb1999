package com.example.News.Aggregator.API.Entities;
import jakarta.validation.constraints.*;



public class UserDTO {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

