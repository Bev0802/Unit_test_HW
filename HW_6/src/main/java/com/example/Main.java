package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AverageValueList averageValueList = new AverageValueList();


        List<Integer> randomList_1 = GenerateRandomList.getRandomList(100, 10);
        List<Integer> randomList_2 = GenerateRandomList.getRandomList(100, 10);

        System.out.println("Рандомный список: " + randomList_1);
        System.out.println("Рандомный список: " + randomList_2);

        double AverageFromList_1 = averageValueList.getAverageOfNumbers(randomList_1);
        double AverageFromList_2 = averageValueList.getAverageOfNumbers(randomList_2);

        System.out.println("Среднее значение списка 1: " + AverageFromList_1);
        System.out.println("Среднее значение списка 2: " + AverageFromList_2);

        AverageValueList.comparisonOfNumbers(AverageFromList_1, AverageFromList_2);
    }
}