package com.third.properties;

public class square extends Rectangle {
	
	 @Override
	    public void setWidth(int width) {
	        super.setWidth(width);
	        super.setHeight(width);
	    }

	    @Override
	    public void setHeight(int height) {
	        super.setHeight(height);
	        super.setWidth(height);
	    }

}
