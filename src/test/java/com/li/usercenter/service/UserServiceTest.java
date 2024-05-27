package com.li.usercenter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        String userAccount = "quake";
        String userPasssword = "";
        String checkPassword = "12345678";

        long result = userService.userRegister(userAccount, userPasssword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "";
        userPasssword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPasssword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "_uake";
        userPasssword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPasssword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "quake";
        userPasssword = "12345678";
        checkPassword = "12345679";
        result = userService.userRegister(userAccount, userPasssword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "testQuake";
        userPasssword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPasssword, checkPassword);
        Assertions.assertEquals(-1, result);

//        userAccount = "quake";
//        userPasssword = "12345678";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPasssword, checkPassword);
//        Assertions.assertTrue(result > 0);
    }
}