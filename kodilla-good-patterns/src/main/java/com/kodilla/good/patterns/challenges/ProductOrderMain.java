package com.kodilla.good.patterns.challenges;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new UserInfo(), new DeliveryAddress());
        productOrderService.process(new Product(), 4);
    }
}
