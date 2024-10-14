package com.mvc.entity;

public class test {
	public static void main(String[] args) {
        
        Model model = new Model();
        View view = new View();

        
        Controller controller = new Controller(model, view);

        
        controller.add(5, 3); 
        controller.add(10, 20); 
    }
}