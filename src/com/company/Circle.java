package com.company;

public class Circle {
    public static Double PI = 3.14;
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double area(){
        return PI*radius*radius;
    }
}
