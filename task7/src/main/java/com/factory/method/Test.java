package com.factory.method;

public class Test {
	public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

       
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.drow();

       
        Shape square = shapeFactory.createShape("SQUARE");
        square.drow(); 
    }

}


//The Factory Method Design Pattern is a creational design pattern that provides an interface
//for creating objects but allows subclasses to alter the type of objects that will be created.
//Instead of calling a constructor directly to create an object, the client code calls a factory
//method that can return an object of a type derived from a common base class or interface.