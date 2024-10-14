package com.second.properties;

public class studentdiscount implements Discount {

	@Override
	public double applyDiscount(double price) {
		// TODO Auto-generated method stub
		
		return price * 0.90; 
		
	}

}
