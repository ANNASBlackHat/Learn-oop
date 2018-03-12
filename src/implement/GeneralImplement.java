package implement;

import entity.Product;
import interfaces.GeneralInterface;

public class GeneralImplement implements GeneralInterface{

    Product product = new Product();

    public  GeneralImplement(){
        //set connection to database....
    }

    @Override
    public void insert(Object obj) {
        if(obj instanceof Product){
            product = (Product) obj;  //casting
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Object getData() {
        return product;
    }
}
