package com.FutManager.model;

import java.util.List;

public class UserModel {
    private static final int MIN_USERNAME = 3;
    private static final int MIN_PASSWORD = 8;
    private static final int MAX_LENGTH = 256;
    private static final List<String> ROLES = List.of("Futbolista", "Analista", "Administrator");

    private final String userId;
    private String userName;
    private String password;
    private String email;
    private String role;


    UserModel(String userName, String password, String email, String userId, String role) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    public String getRole() {
       return role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static boolean checkUserName(String userName) {
        return userName != null && userName.length() >= MIN_USERNAME && userName.length() <= MAX_LENGTH;
    }

    public static boolean checkPassword(String password) {
        return password != null && password.length() >= MIN_PASSWORD && password.length() <= MAX_LENGTH;
    }

    public static boolean checkRole(String role) {
        return role != null && ROLES.contains(role);
    }

}
