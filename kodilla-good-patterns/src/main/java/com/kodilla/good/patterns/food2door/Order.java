package com.kodilla.good.patterns.food2door;

public class Order{
    private String foodSupplier;
    private Product product;
    private int productQuantity;
    private String userInfo;

    public Order(String foodSupplier, Product product, int productQuantity, String userInfo){
        this.foodSupplier = foodSupplier;
        this.product = product;
        this.productQuantity = productQuantity;
        this.userInfo = userInfo;
    }

    public String displayOrder(){
        String orderInfo = "Order from: " + foodSupplier + ", contains product: " + product.getProductName() +
                ", quantity: " + productQuantity + ". " + userInfo;
        return orderInfo;
    }
}
