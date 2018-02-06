package me.ajonbin.designpattern.chainofresponsibility;

public abstract class HandlerKitchenStaff {
	protected HandlerKitchenStaff successor;

	public void setSuccessor(HandlerKitchenStaff successor){
		this.successor = successor;
	}

	public abstract void handleRequest(KitchenRequest request);
}
