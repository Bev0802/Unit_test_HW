/*Задание 2. (необязательное) *
Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), 
который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список 
продуктов (правильное количество продуктов, верное содержимое корзины).
Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки 
корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product 
для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов. */

package org.example.Shop;

public class Product implements Comparable<Product> {
    private String title;
    private Integer cost;

    public Product(String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }

    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Product product) {
        return this.getCost().compareTo(product.getCost());
    }

    @Override
    public String toString() {
        return "Product [title=" + title + ", cost=" + cost + "]";
    }
}
