package me.ajonbin.designpattern.templatemethod;

public class ConcreteMakeGrilledSteakSalad extends AbstractBaseTemplateMakeSalad{
	@Override
	public void methodAddVegetable() {
		System.out.print("Add 1 Cucumber and 1 tomato; ");

	}

	@Override
	public void methodAddMeat() {
		System.out.print("Add grilled steak; ");
	}

	@Override
	public void methodAddCondiment() {
		System.out.print("Add 2 spoon sugar and 1 spoon sesame oil; ");

	}

	@Override
	public void methodAddDressing() {
		System.out.println("Add Asia Dressing ");

	}
}
