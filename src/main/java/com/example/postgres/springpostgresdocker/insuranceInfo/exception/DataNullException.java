package com.example.postgres.springpostgresdocker.insuranceInfo.exception;

public class DataNullException extends RuntimeException{
    public DataNullException (String s){
        super(s);
    }
}
