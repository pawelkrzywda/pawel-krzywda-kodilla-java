package com.kodilla.good.patterns.challenges;

import java.util.LinkedList;
import java.util.List;

public class OrderedProducts{
    private List<SingleOrder> productList = new LinkedList<SingleOrder>();

    public boolean orderProduct(Product product, int productQuantity){
        if(product.isAvailable(productQuantity)){
            productList.add(new SingleOrder(product, productQuantity));
            return true;
        }else{return false;}
    }

    public List<SingleOrder> getProductList(){
        return productList;
    }
}
