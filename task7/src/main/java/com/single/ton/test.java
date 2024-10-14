package com.single.ton;

public class test {

    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();

        // Show the message
        singleton.showMessage();
    }
}
