package com.solid.principle;

public class SingleResponsibility {
	
	    private String name;
	    private String email;

	    public SingleResponsibility(String name, String email) {
	        this.name = name;
	        this.email = email;
	    }
	    
	    //only changes can done in only one 

	    // User class should not be responsible
	    public void saveToDatabase() {
	        // Code to save user to database
	    }
	}
	
	

//A class should have only one reason to change, meaning it should only have one job or responsibility.




