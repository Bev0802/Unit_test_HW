package org.example.Shop;

import java.util.Collections;
import java.util.List;

public class Shop {
   private List<Product> products;

   public Shop() {
   }

   public List<Product> getProducts() {
      return this.products;
   }

   public void setProducts(List<Product> products) {
      this.products = products;
   }
    // сортирует список продуктов по стоимости. 
   public List<Product> getSortedListProducts() {
      Collections.sort(this.products);
      return this.products;
   }
   // возвращает самый дорогой продукт
   public Product getMostExpensiveProduct() {
      return (Product)this.getSortedListProducts().get(this.products.size() - 1);
   }
}
