package me.ajonbin.designpattern.flyweight;

public class BookOrder {
	FlyweightBook book;
	int orderNumber;

	public BookOrder(FlyweightBook book, int orderNumber) {
		this.book = book;
		this.orderNumber = orderNumber;
	}

	public void process(){
		System.out.println(String.format("Process Order %d on book %s",orderNumber,book.getTitle()));
	}

}
