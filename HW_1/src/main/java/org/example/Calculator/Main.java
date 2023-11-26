package org.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double c = calculator.calculateDiscount(333.5, 13);        
        System.out.println(c);
        System.out.printf("%.2f", c);
    }
}

    