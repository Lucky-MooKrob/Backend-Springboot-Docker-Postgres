package com.example.postgres.springpostgresdocker.insuranceMiniDetails.exception;

public class DataNullException extends RuntimeException{
    public DataNullException (String s){
        super(s);
    }
}
