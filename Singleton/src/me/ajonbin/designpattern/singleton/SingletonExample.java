package me.ajonbin.designpattern.singleton;

public class SingletonExample {

	public static void main(String[] args){
		SingletonDB db1 = SingletonDB.getInstance();
		SingletonDB db2 = SingletonDB.getInstance();
		System.out.println(db1);
		System.out.println(db2);
	}
}
