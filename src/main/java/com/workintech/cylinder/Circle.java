package com.workintech.cylinder;

public class Circle {

    private double radius;

    public Circle(double x){
        this.radius = setRadius(x);
    }
// niye kızıyor?
//    public void double setRadius(double x){
//        this.radius = x<0 ? 0 : x;
//    }
    public double setRadius(double x){
        return this.radius = x<0 ? 0 : x;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
