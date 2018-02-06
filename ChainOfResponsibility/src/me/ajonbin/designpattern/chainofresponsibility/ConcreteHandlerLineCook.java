package me.ajonbin.designpattern.chainofresponsibility;

public class ConcreteHandlerLineCook extends HandlerKitchenStaff{
	@Override
	public void handleRequest(KitchenRequest request) {
		switch (request){
			case MAKE_A_DISH:
				System.out.println("The Line Cook can make a dish");
				return;
			case DEVELOP_A_DISH:
				System.out.println("The Line Cook can not develop a dish, send request to successor");
				successor.handleRequest(request);
				return;
		}
	}
}
