package me.ajonbin.designpattern.iterator;

public class IteratorExample {
	public static void main(String[] args){
		FoodStore foodStore = new FoodStore();
		try {
			foodStore.addFood("Cucumber");
			foodStore.addFood("Bean");
			foodStore.addFood("Meat");
			foodStore.addFood("Pepper");
			foodStore.addFood("Beef");
			foodStore.addFood("Beef");

		}catch (Exception e){
			e.printStackTrace();
		}

		for (String food: foodStore) {
			System.out.println(food);
		}
	}
}
