package me.ajonbin.designpattern.bridge;

import java.util.Map;

public abstract class AbstractionKeyValuePrinter {

	public String print(ImplementorKeyValueFormatter formatter){
		return formatter.formate(getTitle(),getKeyValue());
	}

	protected abstract Map<String,String> getKeyValue();

	protected abstract String getTitle();


}
