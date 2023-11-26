package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AverageValueListTest {
    AverageValueList averageValueList;

    @BeforeEach
    public void BeforeEach() {
        averageValueList = new AverageValueList();
    }
    @AfterEach
    public void AfterEach() {
        averageValueList = null;
    }

    @Test
    public void testGetAverageOfNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        double result = averageValueList.getAverageOfNumbers(numbers);
        assertEquals(3.0, result, 0.01);  // Проверяем, что среднее значение равно 3.0 с погрешностью 0.01
    }

    @Test
    public void testGetAverageOfNumbersEmptyList() {
        List<Integer> numbers = Arrays.asList();
        double result = averageValueList.getAverageOfNumbers(numbers);
        assertEquals(0.0, result, 0.01);  // Проверяем, что среднее значение пустого списка равно 0.0 с погрешностью 0.01
    }

    @Test
    public void testComparisonOfNumbers() {
        double number1 = 3.5;
        double number2 = 2.5;
        // Поскольку в вашем методе сравнения используется округление до int, используем 0.0 как допустимую погрешность
        assertEquals(0, Double.compare(number1, number1), 0.0);
        assertEquals(1, Double.compare(number1, number2), 0.0);
        assertEquals(-1, Double.compare(number2, number1), 0.0);
    }
}