package com.teachmeskills.lesson_13.exception;

public class WrongPasswordException extends  Exception{

    private  int exceptionPCode;

    public WrongPasswordException(String message, int exceptionCode) {
        super(message);
        this.exceptionPCode = exceptionCode;
    }
    public int GetExceptionCode() {
        return exceptionPCode;
    }
}
