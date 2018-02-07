package me.ajonbin.designpattern.observer;

public class ObserverExample {
	public static void main(String[] args){
		ConcreteSubjectTwitterMessage twitterMessage = new ConcreteSubjectTwitterMessage();

		ConcreteObserverPhone observerPhone = new ConcreteObserverPhone(twitterMessage);
		ConcreteObserverTablet observerTablet = new ConcreteObserverTablet(twitterMessage);
		ConcreteObserverWeb observerWeb = new ConcreteObserverWeb(twitterMessage);

		twitterMessage.twitter("Hello, my first twitter message");
		twitterMessage.twitter("Hey, it's me again");
		twitterMessage.twitter("Now, I'm very comfortable with twittering new message");

	}
}
