package implement;

import entity.Product;
import interfaces.ProductInterface;

public class ProductImplement implements ProductInterface{

    private Product product = new Product();

    public void setConnection(){
        //doing what ever you want... create connection to database
    }

    @Override
    public void insert(Product product) {
        //insert to database ....
        this.product = product;
    }

    @Override
    public Product get() {
        return product;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
