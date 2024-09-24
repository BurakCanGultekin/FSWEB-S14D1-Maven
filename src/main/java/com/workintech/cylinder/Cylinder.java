package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder (double x, double h) {
        super(x);
        this.height = h < 0 ? 0 : h;
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height; //super&this???
    }

}
