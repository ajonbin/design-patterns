package me.ajonbin.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ClientOrderSystem {
	List<BookOrder> orders = new ArrayList<BookOrder>();
	int orderNumber = 0;
	FlyweightFactoryBookStore bookStore = new FlyweightFactoryBookStore();


	public void takeOrder(String title){
		FlyweightBook book = bookStore.getBook(title);
		BookOrder order = new BookOrder(book,orderNumber++);
		orders.add(order);

	}

	public void processOrders(){
		for(BookOrder order : orders){
			order.process();
		}

		System.out.println("Total Order Processed: " + orders.size());
		System.out.println("Total Book Created: " + bookStore.numberOfBook());
	}
}
