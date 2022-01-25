package com.example.springbootexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SquareManager {

    private Square square;

    @Autowired
    public void setSquareManager(Square square) {
        this.square = square;
    }

    public void getSquare(){
        square.area(10);
    }
}
