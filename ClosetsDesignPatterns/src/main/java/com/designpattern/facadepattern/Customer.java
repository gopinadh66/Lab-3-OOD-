package com.designpattern.facadepattern;

public class Customer {
	public static void main(String[] args) {
		
		SalesManagerFacade slman = new SalesManagerFacade();
		
		slman.showWoodClosetTypes();
		slman.ShowClosetTypes();
		slman.ShowWoodTypes();
	}
}
