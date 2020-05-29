package com.sapientpjp.assignment.MobilePhone;

public class Mobile {
	
	Screen screen;
	Camera camera;
	Speaker speaker;
	
	public Mobile() {
		System.out.println("New mobile created");
	}
	
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

}
