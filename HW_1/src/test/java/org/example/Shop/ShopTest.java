package org.example.Shop;

import org.assertj.core.api.Assertions;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Collections;


class ShopTest {
    Shop testShop = new Shop();
    @Test
    void setUp() {
      
        
      testShop.setProducts(getShuffleListProducts(getTestListProducts()));

      Assertions.assertThat(testShop.getProducts()).hasSize(4);
      Assertions.assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo(((Product)getTestListProducts().get(3)).getTitle());
      Assertions.assertThat(((Product)testShop.getSortedListProducts().get(0)).getCost()).isEqualTo(100);
      Assertions.assertThat(((Product)testShop.getSortedListProducts().get(1)).getCost()).isEqualTo(150);
      Assertions.assertThat(((Product)testShop.getSortedListProducts().get(2)).getCost()).isEqualTo(299);
      Assertions.assertThat(((Product)testShop.getSortedListProducts().get(3)).getCost()).isEqualTo(500);
    }

    static List<Product> getTestListProducts() {
        
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Молоко 2л", 100));
        productList.add(new Product("Сметана 1л", 150));
        productList.add(new Product("Кефир 1л", 299));
        productList.add(new Product("Сыр 1л", 500));
        return productList;
     }
  
     static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
     }    
}