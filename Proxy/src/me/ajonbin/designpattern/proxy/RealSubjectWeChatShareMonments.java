package me.ajonbin.designpattern.proxy;

public class RealSubjectWeChatShareMonments implements SubjectShareMoments{
	@Override
	public void share(String msg) {
		System.out.println(String.format("Share %s in WeChat Moments",msg));
	}
}
