package com.example.myapplication;

public class TestClass implements I1,I2
{
    public static void main(String[] args)
        {
            TestClass t= new TestClass();
           String  a=t.getGreeting();
            System.out.println(a);
        }


    @Override
    public String getGreeting() {
        return I1.super.getGreeting()+"   "+I2.super.getGreeting();
    }
}
