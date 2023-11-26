package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс для генерации случайного списка целых чисел:
 * - заданной длинны - listSize
 * - заданного диапазона - toNum
 */
public class GenerateRandomList {

    public static List<Integer> getRandomList(int toNum, int listSize) {
        List<Integer> randomNumbers = new ArrayList<>();

        // Генерируем рандомные числа от 1 до toNum и добавляем их в ArrayList
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            randomNumbers.add(random.nextInt(toNum) + 1);
        }
        return randomNumbers;
    }
}
