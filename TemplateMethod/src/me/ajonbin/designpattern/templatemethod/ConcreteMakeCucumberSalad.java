package me.ajonbin.designpattern.templatemethod;

public class ConcreteMakeCucumberSalad extends AbstractBaseTemplateMakeSalad{
	@Override
	public void methodAddVegetable() {
		System.out.print("Add 2 Cucumber; ");
	}

	@Override
	public void methodAddMeat() {

	}

	@Override
	public void methodAddCondiment() {
		System.out.print("Add 1 spoon salt; ");

	}

	@Override
	public void methodAddDressing() {
		System.out.println("Add Italy Dressing");

	}
}
