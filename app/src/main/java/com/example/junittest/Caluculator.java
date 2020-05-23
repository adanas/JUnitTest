package com.example.junittest;

public class Caluculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int substract(int a,int b) {
        return a - b;
    }

    public float divide(int a, int b) {
        if(0 == b) {
            return 0;
        }
        return a / b;
    }
}
