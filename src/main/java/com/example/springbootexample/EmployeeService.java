package com.example.springbootexample;


import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private Employee employee;


    public void printDetails(){
        System.out.println("Employee details are available");
    }
}
