package com.example.springbootexample.practice;


import org.springframework.stereotype.Service;

@Service
public class Addition{
    public int add(int a, int b) {
        return a+b;
    }
//
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }
}
