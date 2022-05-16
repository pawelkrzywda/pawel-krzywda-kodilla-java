package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();



    public boolean addFigure(Shape shape) {
        shapes.add(shape);
        if (shapes.contains(shape)) {
            return true;
        } else return false;
    }

    public boolean removeFigure(Shape shape){
        shapes.remove(shape);
        if (shapes.contains(shape)) {
            return false;
        } else return true;
    }

    public Shape getFigure(int n){
        if(n<0 || n>(shapes.size()-1)){return null;
        }else
        return shapes.get(n);
    }

    public String showFigures(){
        String result = "";
        for(int i=0; i<shapes.size();i++){
            if(i==0){
                result = (shapes.get(i)).getShapeName();
            }else{
                result = result + ", " + (shapes.get(i)).getShapeName();
            }

        }
        return result;
    }

    public int getShapesQuantity(){
        return shapes.size();
    }
}
