package com.third.properties;
class Squar implements shap {
    private int side;

    public Squar(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}