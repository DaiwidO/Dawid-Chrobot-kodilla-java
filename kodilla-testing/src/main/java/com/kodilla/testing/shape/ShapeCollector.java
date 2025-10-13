package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public void removeFigure(Shape shape){
        figures.remove(shape);
    }

    public Shape getFigure(int n){
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        else return null;
    }

    public String showFigures(){
        String result = "";

        for (int i = 0; i < figures.size(); i++) {
            result += figures.get(i) + " ";
        }
        return result;
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}
