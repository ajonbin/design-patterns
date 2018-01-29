package me.ajonbin.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentMenu {
	String name;
	String path;
	List<ComponentMenu> components = new ArrayList<ComponentMenu>();

	public String getName() {
		return name;
	}

	public String getPath() {
		return path;
	}

	public abstract String toMenuString();

	public String toMenuString(ComponentMenu componentMenu){
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(": ");
		builder.append(path);
		builder.append("\n");

		return builder.toString();
	}
}
