package me.ajonbin.designpattern.chainofresponsibility;

public class ConcreteHandlerDishWasher extends HandlerKitchenStaff{
	@Override
	public void handleRequest(KitchenRequest request) {
		switch (request){
			case WASH_DISHES:
				System.out.println("The DishWasher can wash dishes");
				return;
			case MAKE_A_DISH:
			case DEVELOP_A_DISH:
				System.out.println("The DishWasher can not handler the request, send to successor");
				successor.handleRequest(request);
				return;
		}
	}
}
