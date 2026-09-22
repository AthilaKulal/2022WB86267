package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World from Jenkins CI/CD!");
        System.out.println("Configured jenkins build polling");
        System.out.println("Build successful!");
    }

    public static String getGreeting() {
        return "Hello World";
    }
}
