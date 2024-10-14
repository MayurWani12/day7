package com.third.properties;

public class Rectangl implements shap {

	 private int width;
	    private int height;

	    public Rectangl(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    public int getArea() {
	        return width * height;
	    }

}
