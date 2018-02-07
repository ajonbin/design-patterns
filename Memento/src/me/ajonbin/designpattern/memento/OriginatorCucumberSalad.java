package me.ajonbin.designpattern.memento;

public class OriginatorCucumberSalad {
	private double cucumber = 0;
	private double sugar = 0;
	private double salt = 0;
	private double dressing = 0;

	public void addCucumber(double cucumber){
		this.cucumber += cucumber;
	}

	public void addSugar(double sugar){
		this.sugar += sugar;
	}

	public void addSalt(double salt){
		this.salt += salt;
	}
	public void addDressing(double dressing){
		this.dressing += dressing;
	}

	public MementoCucumberSalad save(){
		return new MementoCucumberSalad(sugar,salt,dressing);
	}

	public void reload(MementoCucumberSalad memento){
		sugar = memento.getSugar();
		salt = memento.getSalt();
		dressing = memento.getDressing();
	}

	public void show(){
		System.out.println(String.format("The salad is made of %.1f Cucumber, %.1f spoon Sugar, %.1f spoon Salt and %.1f dressing",
			cucumber,sugar,salt,dressing));
	}
}
