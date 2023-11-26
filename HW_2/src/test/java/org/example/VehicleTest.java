package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/* 
 * Проект Vehicle. Написать следующие тесты с использованием JUnit5:
*/
class VehicleTest {
    private static Car car;
    private static Motorcycle motorcycle;
    VehicleTest() { }
    /*
     * - Проверить, что экземпляр объекта Car также является экземпляром
     * транспортного средства (используя оператор instanceof). *
     */
    @BeforeEach
    public void beforeAll() {
        car = new Car("Toyota", "Raw4", 2023);
        motorcycle = new Motorcycle("Kawasaki", "Ninja", 2022);
    }

    /* очистить переменную car */
    @AfterEach
    public void afterAll() {
        car = null;
        motorcycle = null;
    }

    @Test
    public void testCarInstanceIsVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /*
     * - Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void testCarHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    /*- Проверить, что объект Motorcycle создается с 2-мя колесами. */
    @Test
    public void testMotorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    /*
     * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
     * (используя метод testDrive()).
     */
    @Test
    public void testCarTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    /*
     * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового
     * вождения
     * (используя метод testDrive()).
     */
    @Test
    public void testMotorcycleTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    /*
     * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
     * эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    /*
     * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
     * эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
