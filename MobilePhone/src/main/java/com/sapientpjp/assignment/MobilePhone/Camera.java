package com.sapientpjp.assignment.MobilePhone;

public class Camera {

	int megaPixels;
	boolean hasOIS;
	
	public Camera() {
		System.out.println("New camera created");
	}
	
	public int getMegaPixels() {
		return megaPixels;
	}
	public void setMegaPixels(int megaPixels) {
		this.megaPixels = megaPixels;
	}
	public boolean isHasOIS() {
		return hasOIS;
	}
	public void setHasOIS(boolean hasOIS) {
		this.hasOIS = hasOIS;
	}
	
}
