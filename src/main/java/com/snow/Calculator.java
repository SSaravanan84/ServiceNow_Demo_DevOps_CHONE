package com.snow;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;

        //Feature-3 Update
        //Feature-3 Update2
        //Main Update 1
        //Main Update 2
        //Main Update 3
        //Main Update 4
        //Main update 5
        //Main update Dec 29
    }
}
