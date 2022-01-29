package com.designpattern.commandpattern;

public class Manufacturer {
	private Product product;


	public void setProduct(Product product) {
		this.product = product;
	}
	
	public boolean selectProduct() {
		return product.deliver();
	}
}
