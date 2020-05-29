package com.sapientpjp.assignment.MobilePhone;

public class Speaker {
	
	String position;
	int maxVolume;
	
	public Speaker() {
		System.out.println("New speaker created");
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getMaxVolume() {
		return maxVolume;
	}
	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}
	
}
