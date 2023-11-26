package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GenerateRandomListTest {

    @Test
    public void testGetRandomList() {
        int toNum = 10;
        int listSize = 5;

        List<Integer> randomList = GenerateRandomList.getRandomList(toNum, listSize);

        assertEquals(listSize, randomList.size());
        for (int num : randomList) {
            assertTrue(num >= 1 && num <= toNum);
        }
    }

    @Test
    public void testGetRandomListEmpty() {
        int toNum = 10;
        int listSize = 0;

        List<Integer> randomList = GenerateRandomList.getRandomList(toNum, listSize);

        assertTrue(randomList.isEmpty());
    }
}
