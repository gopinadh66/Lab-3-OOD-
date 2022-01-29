package com.designpattern.commandpattern;

public class OrderLinenCloset implements Product {
	Wood wood;
	   
	
	public OrderLinenCloset(Wood wood) {
		
		this.wood = wood;
	}


	public boolean deliver() {
		return wood.acceptWood();
		
	}

}
