package org.example;

public class MainHW {
    public static void main(String[] args) {
        System.out.println(evenOddNumber(3));
        System.out.println(evenOddNumber(2));

        System.out.println(numberInInterval(50));
        System.out.println(numberInInterval(10));
        System.out.println(numberInInterval(101));
    }

    /* HW 3.1. Нужно покрыть тестами метод на 100%
    * Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    */
    public static boolean evenOddNumber(int n) {
        return (n % 2 == 0);
    }

    /*
    * HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал
    * (25;100) и возвращает true, если попадает и false - если нет, покрыть тестами метод на 100%.
    */
    public static boolean numberInInterval(int num) {
        return num > 25 && num < 100;
    }

}
