package me.ajonbin.designpattern.memento;

public class MementoCucumberSalad {
	private double sugar;
	private double salt;
	private double dressing;

	public MementoCucumberSalad(double sugar, double salt, double dressing) {
		this.sugar = sugar;
		this.salt = salt;
		this.dressing = dressing;
	}

	public double getSugar() {
		return sugar;
	}

	public double getSalt() {
		return salt;
	}

	public double getDressing() {
		return dressing;
	}
}
