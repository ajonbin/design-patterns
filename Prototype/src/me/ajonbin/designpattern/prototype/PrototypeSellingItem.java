package me.ajonbin.designpattern.prototype;

public class PrototypeSellingItem implements Cloneable{
	protected String title;
	protected String url;
	protected double price;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return String.format("Title: %s, Price: %f, URL: %s",title,price,url);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public double getPrice() {
		return price;
	}
}
