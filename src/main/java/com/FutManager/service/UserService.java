package com.FutManager.service;
import com.FutManager.service.UserService;
import java.util.Scanner;

public class UserService {
    private final String userName;
    private final String password;
    private final String email;

    UserService(String userName, String password, String email) {
      this.userName = userName;
      this.password  = password;
      this.email = email;
    }


}
