package me.ajonbin.designpattern.composite;

public class LeafMenuItem extends ComponentMenu{

	public LeafMenuItem(String name,String path){
		this.name = name;
		this.path = path;
	}
	@Override
	public String toMenuString() {
		return toMenuString(this);
	}
}
