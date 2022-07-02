package com.kodilla.good.patterns.food2door;

public class Food2DoorMain{
    public static void main(String[] args){
        User john = new User();
        FoodSupplier extraFoodShop = new FoodSupplier("ExtraFoodShop");
        Product eggs = new Product("eggs", 12);
        extraFoodShop.addProduct(eggs);
        Order order1 = extraFoodShop.process(john, eggs, 10);
    }
}
