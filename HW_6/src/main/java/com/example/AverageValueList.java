package com.example;

import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class AverageValueList {

    /**
     * Метод getAverageOfNumbers вычисляет среднее значение чисел из списка целых чисел.
     * @param numbers - Список целых чисел
     * @return Double - Среднее значение округленное до 2 знаков после запятой.
     */
    public double getAverageOfNumbers(List<Integer> numbers) {
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue) // Преобразуем Integer в double
                .average() // Вычисляем среднее значение
                .orElse(0.0); // Если списка нет, то возвращаем 0.0

        return Math.round(average * 100.0) / 100.0; // округляем до двух знаков после запятой.
    }

    /**
     * Метод comparisonOfNumbers сравнивает среднее значение двух списков
     * @param number1
     * @param number2
     */
    public static void comparisonOfNumbers(double number1, double number2) {
        DoubleBinaryOperator compare = (x, y) -> Double.compare(x, y);
        int result = (int) compare.applyAsDouble(number1, number2);

        if (result > 0) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (result < 0) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}


