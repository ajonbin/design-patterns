package me.ajonbin.designpattern.bridge;

public class BridgeSample {

	public static void main(String[] args){
		BridgeClient();
	}


	public static void BridgeClient(){
		UserInfo user = new UserInfo();
		user.name = "John";
		user.age = 28;
		user.mail = "john@designpatten.com";
		user.phone = "1234567890";

		BookInfo book = new BookInfo();
		book.author = "Smith Lary";
		book.ISBN = "9787122304650";
		book.publisher = "Dover Publications";
		book.title = "Ordinary Differential Equations";

		ConcreteImplementorJsonKVFormatter jsonKVFormatter = new ConcreteImplementorJsonKVFormatter();
		ConcreteImplementorHtmlTableKVFormatter tableKVFormatter = new ConcreteImplementorHtmlTableKVFormatter();

		RefinedAbstractionUserInfoPrinter jsonUserPrinter = new RefinedAbstractionUserInfoPrinter(user);
		RefinedAbstractionBookInfoPrinter jsonBookPrinter = new RefinedAbstractionBookInfoPrinter(book);


		System.out.println("---- Book in JSON format ----");
		System.out.println(jsonBookPrinter.print(jsonKVFormatter));
		System.out.println("---- Book in Table format ----");
		System.out.println(jsonBookPrinter.print(tableKVFormatter));
		System.out.println("---- User in JSON format ----");
		System.out.println(jsonUserPrinter.print(jsonKVFormatter));
		System.out.println("---- User in Table format ----");
		System.out.println(jsonUserPrinter.print(tableKVFormatter));

	}
}
