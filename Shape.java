package com.education_wired_.work1;

public abstract class Shape implements Drawable, Comparable, Cloneable{
    private String color ;
    public abstract double calcArea();

    public String getColor() {
        return color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName()+ ": color = " + color;
    }

    @Override
    public void draw() {
        System.out.println(this + " -> area =  " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        //return (int)(this.calcArea()-((Shape)o).calcArea());
        return Double.compare(this.calcArea(),((Shape)o).calcArea());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
