package com.sapientpjp.assignment.MobilePhone;

public class Screen {

	int length;
	int width;
	boolean isTouch;
	
	public Screen() {
		System.out.println("New screen created");
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public boolean isTouch() {
		return isTouch;
	}
	public void setTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}
	
	
}
