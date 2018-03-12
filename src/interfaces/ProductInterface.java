package interfaces;


import entity.Product;

public interface ProductInterface {
    void insert(Product product);
    Product get();
    void update();
    void delete();
}
