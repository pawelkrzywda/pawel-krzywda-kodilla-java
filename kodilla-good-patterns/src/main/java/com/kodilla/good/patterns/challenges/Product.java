package com.kodilla.good.patterns.challenges;

public class Product{
    private String productName = "Play Station 5";
    private int stock = 23;

    public boolean isAvailable(int wantedQuantity){
        if(stock > wantedQuantity){
            return true;
        } else {return false;}
    }
}
