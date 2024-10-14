package com.second.properties;

public class test {

	
	
	    public static void main(String[] args) {
	        Discount studentDiscount = new studentdiscount();
	        Discount seniorDiscount = new sinierdiscount();

	        DiscountCalculator calculator = new DiscountCalculator();

	        double studentPrice = calculator.calculatePrice(100, studentDiscount);
	        double seniorPrice = calculator.calculatePrice(100, seniorDiscount);

	        System.out.println("Student Price: " + studentPrice); // Output: 90.0
	        System.out.println("Senior Price: " + seniorPrice);   // Output: 85.0
	    }
	}


