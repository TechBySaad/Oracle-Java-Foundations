package com.Module1;

public class SyntaxOfJava {
    private String greetings = "Hello"; // this is variable

    public String sayHello(String name) { // this is method
        return greetings + " " + name;
    }

    public static void main(String[] args) { // main method
        SyntaxOfJava test = new SyntaxOfJava(); // creation of object with the class' reference
        System.out.println(test.sayHello("Saad")); // calling the method with the help of object
    }
}