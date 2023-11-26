package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    /*
     * Проверить Метод evenOddNumber, который проверяет, является ли целое число
     * записанное в переменную n, чётным (true) либо нечётным (false).
     */
    @Test
    void evenOddNumber() {
        assertTrue(MainHW.evenOddNumber(4), "Ожидается true для четного числа");
        assertFalse(MainHW.evenOddNumber(7), "Ожидается false для нечетного числа");
        assertTrue(MainHW.evenOddNumber(0), "Ожидается true для нуля (четное)");
        assertFalse(MainHW.evenOddNumber(-5), "Ожидается false для отрицательного нечетного числа");
    }

    /*
     * HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число
     * в интервал
     * (25;100) и возвращает true, если попадает и false - если нет, покрыть тестами
     * метод на 100%.
     */
    @Test
    void numberInInterval() {
        assertTrue(MainHW.numberInInterval(50), "Ожидается true для числа в интервале (25;100)");
        assertTrue(MainHW.numberInInterval(26), "Ожидается true для числа в интервале (25;100)");
        assertTrue(MainHW.numberInInterval(99), "Ожидается true для числа в интервале (25;100)");

        assertFalse(MainHW.numberInInterval(25), "Ожидается false для числа включительно границы (25)");
        assertFalse(MainHW.numberInInterval(100), "Ожидается false для числа включительно границы (100)");
        assertFalse(MainHW.numberInInterval(20), "Ожидается false для числа меньше границы (25)");
        assertFalse(MainHW.numberInInterval(110), "Ожидается false для числа больше границы (100)");
    }
}