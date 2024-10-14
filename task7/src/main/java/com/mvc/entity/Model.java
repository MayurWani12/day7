package com.mvc.entity;

public class Model {
	private double result;

    public void add(double a, double b) {
        result = a + b;
    }

    public double getResult() {
        return result;
    }
}