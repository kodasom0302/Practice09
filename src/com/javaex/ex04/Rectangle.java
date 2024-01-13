package com.javaex.ex04;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double w, double h) {
    	this.width=w;
    	this.height=h;
    }
    
    public double getArea() {
    	double result;
    	result=this.width*this.height;
    }

}