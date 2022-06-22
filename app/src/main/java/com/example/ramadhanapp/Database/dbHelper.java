package com.example.ramadhanapp.Database;

import com.example.ramadhanapp.LoginActivity;
import com.example.ramadhanapp.RegisterActivity;

public class dbHelper {
    String email, password;

    public dbHelper(LoginActivity loginActivity) {
    }

    public dbHelper(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public dbHelper(RegisterActivity registerActivity) {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
