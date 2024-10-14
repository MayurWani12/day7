package com.mvc.entity;

public class Controller {
	 private Model model;
	    private View view;

	    public Controller(Model model, View view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void add(double a, double b) {
	        model.add(a, b);
	        view.printResult(model.getResult());
	    }
	}