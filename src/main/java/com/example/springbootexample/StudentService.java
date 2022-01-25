package com.example.springbootexample;

import com.example.springbootexample.practice.Addition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    //field base DI
//    @Autowired
//    private Addition addition;

    private Addition addition;
    //Constructor DI

    @Autowired
    public StudentService(Addition addition){
        this.addition =addition;
    }

    public void getAddition(){
        this.addition.add(1,2);
    }


}
