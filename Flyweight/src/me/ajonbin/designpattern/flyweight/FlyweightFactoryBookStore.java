package me.ajonbin.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactoryBookStore {
	protected Map<String, FlyweightBook> bookStore = new HashMap<String, FlyweightBook>();

	//Factory Method
	public FlyweightBook getBook(String title){
		if(!bookStore.containsKey(title)){
			bookStore.put(title,new FlyweightBook(title));
		}
		return bookStore.get(title);
	}

	public int numberOfBook(){
		return bookStore.size();
	}
}
