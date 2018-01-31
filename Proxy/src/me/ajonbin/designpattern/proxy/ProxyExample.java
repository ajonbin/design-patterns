package me.ajonbin.designpattern.proxy;

import java.lang.reflect.Proxy;

public class ProxyExample {
	public static void main(String[] args){
		clientProxy();
	}

	public static void clientProxy(){
		Object newObj = ProxyFactory.newProxyForShareMoments(new RealSubjectWeChatShareMonments());
		System.out.println(String.format("New Object Class is: " + newObj.getClass().getName()));
		System.out.println(String.format("New Object Super Class is: " + newObj.getClass().getSuperclass().getName()));

		java.lang.reflect.Proxy proxy = (Proxy)newObj;
		//Proxy has same interface as Subject
		SubjectShareMoments shareMoments = (SubjectShareMoments)proxy;

		shareMoments.share("Hello, Patterns");
	}
}
