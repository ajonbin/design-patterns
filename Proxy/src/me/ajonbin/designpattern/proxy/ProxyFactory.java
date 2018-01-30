package me.ajonbin.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyFactory implements InvocationHandler{

	private Object obj;
	public ProxyFactory(Object obj) {
		this.obj = obj;
	}

	public static Object newProxyForShareMoments(Object obj){
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
			obj.getClass().getInterfaces(),
			new ProxyFactory(obj));
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(obj,args);
	}
}
