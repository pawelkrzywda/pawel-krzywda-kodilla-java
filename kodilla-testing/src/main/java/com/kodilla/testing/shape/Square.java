package com.kodilla.testing.shape;

public class Square implements Shape{


    private Double a;

    public Square(Double a) {
        this.a = a;
    }

    public String getShapeName(){
        return "Square";
    }

    public Double getField(){
        return a*a;
    }
}
