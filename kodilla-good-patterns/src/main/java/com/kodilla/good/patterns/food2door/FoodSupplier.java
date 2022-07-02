package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

public class FoodSupplier implements Process{
    private String name;
    private List<Product> productList = new LinkedList<>();

    public FoodSupplier(String name){
        this.name = name;
    }

    public Order process(User user, Product product, int productQuantity){
        for(Product product1 : productList){
            if(product1.equals(product) && product1.getProductStock()>productQuantity){
                Order order = new Order(this.getName(), product, productQuantity, user.getUserInfo());
                System.out.println("Order placed correctly!");
                System.out.println(order.displayOrder());
                return order;
            }
        }
        System.out.println("Unable to place an order.");
        return null;
    }

    public String getName(){
        return name;
    }

    public void addProduct(Product product){
        productList.add(product);
    }
}
