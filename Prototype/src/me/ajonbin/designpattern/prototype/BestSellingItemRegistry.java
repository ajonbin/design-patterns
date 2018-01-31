package me.ajonbin.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class BestSellingItemRegistry {
	private Map<String,PrototypeSellingItem> registry = new HashMap<String, PrototypeSellingItem>();

	public BestSellingItemRegistry(){
		loadItems();
	}

	public PrototypeSellingItem createItem(String category){
		PrototypeSellingItem prototypeSellingItem = registry.get(category);
		try {
			return (PrototypeSellingItem)prototypeSellingItem.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void loadItems(){
		PrototypeBook bestSellBook = new PrototypeBook();
		bestSellBook.setTitle("Killers of the Flower Moon");
		bestSellBook.setISBN("0385534248");
		bestSellBook.setPublisher("Doubleday");
		bestSellBook.setPrice(17.37);
		bestSellBook.setUrl("http://bookstore.com/killersoftheflowermoon");


		PrototypeFood bestSellFood = new PrototypeFood();
		bestSellFood.setTitle("Mama Bear Organic Baby Food Pouch");
		bestSellFood.setUrl("http://bookstore.com/mamabearfoodpouch");
		bestSellFood.setProvider("Mama Bear");
		bestSellFood.setPrice(15.75);

		registry.put("book",bestSellBook);
		registry.put("food",bestSellFood);

	}

}
