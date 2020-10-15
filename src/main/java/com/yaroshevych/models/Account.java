package com.yaroshevych.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

@Entity
@Data
@NoArgsConstructor
public class Account {
    private String username;

    @Email
    private String email;
    private String password;
    private String confirmPassword;

    public Account(String username, String email, String password, String confirmPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
