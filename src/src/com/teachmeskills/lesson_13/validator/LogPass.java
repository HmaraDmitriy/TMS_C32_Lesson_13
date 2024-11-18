package com.teachmeskills.lesson_13.validator;


import com.teachmeskills.lesson_13.exception.WrongLoginException;
import com.teachmeskills.lesson_13.exception.WrongPasswordException;

public class LogPass {
    public static boolean CheckLogin (String login,String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
             throw new WrongLoginException("Invalid login length and contains spaces",001);
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
             throw  new WrongPasswordException("Invalid password length",002);
        }

        if (!password.equals(confirmPassword)){
            throw  new WrongPasswordException("Wrong password",003);
        }

        return  true;
    }
}
