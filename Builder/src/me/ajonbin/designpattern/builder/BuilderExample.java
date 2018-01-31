package me.ajonbin.designpattern.builder;

public class BuilderExample {
	public static void main(String[] args){
		FullCourseDinner.BuilderFullCourse dinnerBuilder = new FullCourseDinner.BuilderFullCourse();

		dinnerBuilder.setAppetizer("Blue Cheese–Pecan Spread").setDessert("Cookie Dough Pie").setMainCourse("Salisbury Steak with Mushrooms").setSalad("Spicy Carrot Salad");

		FullCourseDinner dinner = dinnerBuilder.build();

		dinner.getDinner();
	}

}
