package com.teachmeskills.lesson_13.service;

import com.teachmeskills.lesson_13.exception.WrongLoginException;
import com.teachmeskills.lesson_13.exception.WrongPasswordException;
import com.teachmeskills.lesson_13.validator.LogPass;

public class CheckLogPas {

    public static void CheckLogPas(String login,String password, String confirmPassword){

        try {
            boolean result = LogPass.CheckLogin(login, password, confirmPassword);
             if (result){
                 System.out.println("Login and password are valid.");
             }
        }catch (WrongLoginException | WrongPasswordException e) {
                System.err.println("Validation failed: " + e.getMessage());
        }

    }
}
