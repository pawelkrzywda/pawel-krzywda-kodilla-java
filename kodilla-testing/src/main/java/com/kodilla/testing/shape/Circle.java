package com.kodilla.testing.shape;

public class Circle implements Shape{
    private Double r;

    public Circle(Double r) {
        this.r = r;
    }

    public String getShapeName(){
        return "Circle";
    }

    public Double getField(){
        return 3.14*r*r;
    }

}








