package com.education_wired_.work1;

public class Rectangle extends Shape{
    private int width;
    private int heigth;

    public int getWidth() {
        return width;
    }

    public void setWidth(int vertical) {
        this.width = vertical;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, int width, int heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double calcArea() {
        return heigth * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", width = "+ width + ", heigth = " + heigth;
    }
}
