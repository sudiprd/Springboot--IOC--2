package com.example.springbootexample.practice;


import org.springframework.stereotype.Component;

@Component
public class Subtraction {

    public int subtract (int a, int b){
        return a-b;
    }
    public int divide (int a, int b ){
    return a/b;
    }
}

