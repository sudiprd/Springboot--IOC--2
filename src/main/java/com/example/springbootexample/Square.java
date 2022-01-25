package com.example.springbootexample;


import org.springframework.stereotype.Component;

@Component
public class Square {

    public int area(int length){
        return length * length;
    }

}
