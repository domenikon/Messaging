package com.company;

import java.time.Clock;
import java.time.LocalDateTime;

public class User {

    private String email;
    private String name;
    private String password;
    private Clock clock;
    private LocalDateTime lastLoginTime;

    public User(String email, String name, String password, LocalDateTime lastLoginTime) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLastLoginTime() {
        return LocalDateTime.now(clock);
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }
}
