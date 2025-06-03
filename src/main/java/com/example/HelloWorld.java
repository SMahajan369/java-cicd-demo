package com.example;

public class HelloWorld {
    public String greet() {
        return "Hello, CI/CD!";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().greet());
    }
}
