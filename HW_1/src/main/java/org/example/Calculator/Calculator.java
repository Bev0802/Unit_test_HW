/*Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. 
Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать 
исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения. */

package org.example.Calculator;



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

    public double divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Деление на ноль запрещено!");
        }
        return a / b;
    }

    public double calculateDiscount(double a, int b){
         if (a <= 0 | b <= 0){
            throw new IllegalArgumentException("Цена или скидка не может быть меньше или равна нулю!");
        }
        return (a - (b*(a/100)));
    }


}

