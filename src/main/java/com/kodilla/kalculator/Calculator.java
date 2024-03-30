package com.kodilla.kalculator;

public class Calculator {
    public static int substractAFromB(int a, int b) {
        return a - b;
    }

    public int sumAandB(int a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        int result1 = calculator1.substractAFromB(15, 8);
        System.out.println(result1);

        Calculator calculator2 = new Calculator();
        int result2 = calculator2.sumAandB(7, 3);
        System.out.println(result2);

    }
}
