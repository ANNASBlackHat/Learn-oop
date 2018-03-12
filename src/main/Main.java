package main;

import entity.Category;
import entity.Product;
import implement.ProductImplement;

public class Main {

    public static void main(String[] args) {
        ProductImplement implement = new ProductImplement();

        Product product = new Product();
        product.setId(1);
        product.setName("Coffe cappucino");
        product.setPrice(40000);
        product.setSku("PRD001");

        Category category = new Category();
        category.setId(1);
        category.setName("Beverage");

        product.setCategory(category);

        implement.insert(product);

        System.out.println(implement.get().getName());
    }

}
