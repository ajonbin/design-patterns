package me.ajonbin.designpattern.composite;

import java.util.Iterator;

public class CompositeMenu extends ComponentMenu{

	public CompositeMenu(String name,String path){
		this.name = name;
		this.path = path;
	}


	public void addMenu(ComponentMenu menu){
		components.add(menu);
	}

	@Override
	public String toMenuString() {
		StringBuilder builder = new StringBuilder();
		Iterator<ComponentMenu> itr = components.iterator();

		builder.append(toMenuString(this));

		while (itr.hasNext()){
			builder.append(itr.next().toMenuString());
		}

		return builder.toString();
	}
}
