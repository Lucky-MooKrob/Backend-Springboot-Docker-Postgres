package com.example.postgres.springpostgresdocker.customerInfo.exception;

public class DatanullException extends RuntimeException{
    public DatanullException (String s){
        super(s);
    }
}
