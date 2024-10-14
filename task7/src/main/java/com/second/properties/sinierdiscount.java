package com.second.properties;

public class sinierdiscount implements Discount{

	@Override
	public double applyDiscount(double price) {
		// TODO Auto-generated method stub
		return price*0.55;
	}

}
