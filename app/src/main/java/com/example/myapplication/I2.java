package com.example.myapplication;


public interface I2{

    default String getGreeting() {
        return "Good Morning";
    }
}


