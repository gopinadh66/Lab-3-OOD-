package com.designpattern.commandpattern;

public class OrderUtilityCloset implements Product {

	Wood wood;
	
	
	public OrderUtilityCloset(Wood wood) {
		
		this.wood = wood;
	}


	public boolean deliver() {
		return wood.rejectWood();
		
	}

}
