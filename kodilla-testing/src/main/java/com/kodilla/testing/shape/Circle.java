package com.kodilla.testing.shape;


import java.util.Objects;

public class Circle implements Shape {

    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI *(radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}
