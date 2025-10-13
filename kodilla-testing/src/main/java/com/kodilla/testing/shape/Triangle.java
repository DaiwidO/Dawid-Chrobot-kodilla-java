package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}
