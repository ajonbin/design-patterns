package me.ajonbin.designpattern.chainofresponsibility;

public class ConcreteHandlerChef extends HandlerKitchenStaff {
	@Override
	public void handleRequest(KitchenRequest request) {
		if(request == KitchenRequest.DEVELOP_A_DISH){
			System.out.println("The Chef can develop a new dish");
		}
	}
}