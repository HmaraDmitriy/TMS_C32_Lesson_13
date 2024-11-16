package com.teachmeskills.lesson_13.exception;

public class WrongLoginException extends Exception{

      private  int exceptionLCode;

    public WrongLoginException(String message, int exceptionCode) {
        super(message);
        this.exceptionLCode = exceptionCode;
    }
    public int getExceptionCode() {
        return exceptionLCode;
    }
}
