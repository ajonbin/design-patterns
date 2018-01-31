package me.ajonbin.designpattern.prototype;

public class PrototypeFood extends PrototypeSellingItem{
	protected String provider;

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
