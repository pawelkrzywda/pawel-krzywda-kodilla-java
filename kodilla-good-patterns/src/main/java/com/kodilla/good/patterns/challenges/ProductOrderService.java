package com.kodilla.good.patterns.challenges;

public class ProductOrderService{
    private UserInfo userInfo;
    private DeliveryAddress deliveryAddress;

    public ProductOrderService(UserInfo userInfo, DeliveryAddress deliveryAddress){
        this.userInfo = userInfo;
        this.deliveryAddress = deliveryAddress;
    }

    public OrderDetails process(Product product, int productQuantity){
        OrderedProducts orderedProducts = new OrderedProducts();
        boolean order = orderedProducts.orderProduct(product, productQuantity);

        if(order){
            OrderDetails orderDetails = new OrderDetails(userInfo, deliveryAddress, orderedProducts);
            System.out.println("Order placed correctly!");
            return orderDetails;
        } else{
            System.out.println("Not enough items in stock to place an order.");
            return null;
        }
    }
}
