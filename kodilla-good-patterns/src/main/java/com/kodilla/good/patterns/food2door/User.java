package com.kodilla.good.patterns.food2door;

public class User{
    private String name = "John";
    private String surname = "Smith";
    private String userName = "John_S";
    private int telNumber = 555666777;

    private String street = "Wall Street";
    private int houseNumber = 30;
    private int flatNumber = 8;
    private String zipCode = "10005";
    private String city = "New York";

    public String getUserInfo(){
        String info = "Customer: " + name + " " + surname + ". Delivery address: " + street + " " + houseNumber + "/"
                + flatNumber + " " + zipCode + " " + city;
        return info;
    }
}
