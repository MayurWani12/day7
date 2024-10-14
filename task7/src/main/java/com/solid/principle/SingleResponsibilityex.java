package com.solid.principle;

public class SingleResponsibilityex {
	
	private SingleResponsibility singleResponsibility;
	
private int quantity;

public SingleResponsibilityex(SingleResponsibility singleResponsibility, int quantity) {
	super();
	this.singleResponsibility = singleResponsibility;
	this.quantity = quantity;
}

    private  int calculatedata() {
    	
    	int price=((singleResponsibility.hashCode())*quantity);
		return price;
    }

}


// if we need other data or method get other class 