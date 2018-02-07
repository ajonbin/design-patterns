package me.ajonbin.designpattern.state;

public class StateExample {
	public static void main(String[] args){
		RGBLight rgbLight = new RGBLight();

		rgbLight.requestPushButton();
		rgbLight.requestPushButton();
		rgbLight.requestPushButton();
		rgbLight.requestPushButton();
		rgbLight.requestPushButton();
		rgbLight.requestPushButton();
		rgbLight.requestPushButton();

	}
}
