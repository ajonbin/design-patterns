package me.ajonbin.designpattern.templatemethod;

public abstract class AbstractBaseTemplateMakeSalad {
	public abstract void methodAddVegetable();
	public abstract void methodAddMeat();
	public abstract void methodAddCondiment();
	public abstract void methodAddDressing();

	public void templateMethodMake(){
		methodAddVegetable();
		methodAddMeat();
		methodAddCondiment();
		methodAddDressing();
	}

}
