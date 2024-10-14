package com.single.ton;

class Singleton {
    //  Create a private static variable to hold the single instance
    private static Singleton instance;

    //  Make the constructor private to prevent instantiation
    private Singleton() {
        // 
    }

  
    public static Singleton getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method 
    public void showMessage() {
        System.out.println("Hello");
    }
}


//The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance
//and provides a global point of access to that instance. This pattern is useful when you need exactly
//one object to coordinate actions across the system, such as a configuration manager or a connection pool.