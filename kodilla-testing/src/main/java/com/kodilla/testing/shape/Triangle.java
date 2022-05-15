package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private Double a;
    private Double h;

    public Triangle(Double a, Double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public Double getField(){
        return a*h/2;
    }
}
