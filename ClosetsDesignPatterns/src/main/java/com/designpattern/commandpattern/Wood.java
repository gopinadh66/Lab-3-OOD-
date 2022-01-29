package com.designpattern.commandpattern;

public class Wood {
	private boolean on;
	
	public boolean acceptWood() {
		on = true;
		return on;
	}
	public boolean rejectWood() {
		on = false;
		return on;
	}
}
