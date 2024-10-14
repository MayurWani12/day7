package com.five.property;

public class Computer {
    private Keyboard keyboard;

    public Computer() {
        this.keyboard = new Keyboard();  // Direct dependency on the Keyboard class
    }

    public void receiveInput() {
        keyboard.type();
    }

}
