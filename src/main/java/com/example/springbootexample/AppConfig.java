package com.example.springbootexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name ="student")
    public Student student()
        {
            return new Student();
        }
    }

