package com.second.properties;
public class DiscountCalculator {
    public double calculatePrice(double price, Discount discount) {
        return discount.applyDiscount(price);
    }
}

