package com.kodilla.good.patterns.food2door;

public class Product{
    private String productName;
    private int productStock;

    public Product(String productName, int productStock) {
        this.productName = productName;
        this.productStock = productStock;
    }

    public int getProductStock(){
        return productStock;
    }

    public String getProductName() {
        return productName;
    }
}
