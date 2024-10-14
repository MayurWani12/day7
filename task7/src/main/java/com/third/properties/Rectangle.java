package com.third.properties;

public class Rectangle {
	
	
	//Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
	
	private int width;
    private int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public int getArea() { return width * height; 
    }

}
