package com.designpattern.commandpattern;

public class Client {

	public static void main(String[] args) {

		Manufacturer manufacturer = new Manufacturer();
		Wood wood = new Wood();
		OrderLinenCloset linen = new OrderLinenCloset(wood);
		OrderUtilityCloset utility = new OrderUtilityCloset(wood);
		
		manufacturer.setProduct(linen);
		System.out.println(manufacturer.selectProduct());
		
		manufacturer.setProduct(utility);
		System.out.println(manufacturer.selectProduct());

	}

}
