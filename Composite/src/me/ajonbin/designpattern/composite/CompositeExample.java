package me.ajonbin.designpattern.composite;

public class CompositeExample {
	public static void main(String[] args){
		CompositeClient();
	}
	public static void CompositeClient(){

		CompositeMenu menuMain = new CompositeMenu("Main","/");
		CompositeMenu menuOpen = new CompositeMenu("Open","/open");

		LeafMenuItem itemOpenFromLocal = new LeafMenuItem("Open From Local","/open/local");
		LeafMenuItem itemOpenFromCloud = new LeafMenuItem("Open From Cloud","/open/cloud");

		LeafMenuItem itemClose = new LeafMenuItem("Close","/close");

		menuMain.addMenu(menuOpen);
		menuMain.addMenu(itemClose);
		menuOpen.addMenu(itemOpenFromLocal);
		menuOpen.addMenu(itemOpenFromCloud);

		System.out.println(menuMain.toMenuString());

	}
}
