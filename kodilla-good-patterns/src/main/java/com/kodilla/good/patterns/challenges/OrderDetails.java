package com.kodilla.good.patterns.challenges;

public class OrderDetails {
    private UserInfo userInfo;
    private DeliveryAddress deliveryAddress;
    private OrderedProducts orderedProducts;

    public OrderDetails(UserInfo userInfo, DeliveryAddress deliveryAddress, OrderedProducts orderedProducts) {
        this.userInfo = userInfo;
        this.deliveryAddress = deliveryAddress;
        this.orderedProducts = orderedProducts;
    }
}
