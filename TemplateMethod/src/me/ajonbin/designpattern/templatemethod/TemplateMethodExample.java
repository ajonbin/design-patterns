package me.ajonbin.designpattern.templatemethod;

public class TemplateMethodExample {
	public static void main(String[] args){
		ConcreteMakeCucumberSalad cucumberSalad = new ConcreteMakeCucumberSalad();
		cucumberSalad.templateMethodMake();

		ConcreteMakeGrilledSteakSalad steakSalad = new ConcreteMakeGrilledSteakSalad();
		steakSalad.templateMethodMake();
	}
}
