package com.example.springbootexample;

import com.example.springbootexample.practice.Addition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootExampleApplication implements CommandLineRunner {

    @Autowired
    private SquareManager squareManager;
    private Addition addition;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringbootExampleApplication.class, args);

        Square square = context.getBean(Square.class);
        System.out.println(square.area(100));

        Addition addition = context.getBean(Addition.class);
        System.out.println(addition.add(1,3));

    }

    @Override
    public void run(String... args) throws Exception {
        squareManager.getSquare();
        addition.add(1,2);
    }
}
