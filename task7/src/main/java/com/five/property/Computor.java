package com.five.property;

public class Computor {

	  private inputdevice inputDevice;

	    // Constructor injection
	    public void Compoter(inputdevice inputDevice) {
	        this.inputDevice = inputDevice;  // Depend on an abstraction
	    }

	    public void receiveInput() {
	        inputDevice.type();
	    }
	}
