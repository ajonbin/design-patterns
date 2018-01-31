package me.ajonbin.designpattern.singleton;


public class SingletonDB {

	private static SingletonDB instance;
	private SingletonDB(){
		System.out.println("Create SingleDB Instance");
	}

	public static SingletonDB getInstance(){
		//Lazy Loaded
		if(instance == null){
			//Thread safe
			synchronized (SingletonDB.class){
				if(instance == null){
					instance = new SingletonDB();
				}
			}
		}
		return instance;
	}
}
