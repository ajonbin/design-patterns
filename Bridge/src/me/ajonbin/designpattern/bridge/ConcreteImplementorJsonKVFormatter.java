package me.ajonbin.designpattern.bridge;

import java.util.Map;

public class ConcreteImplementorJsonKVFormatter implements ImplementorKeyValueFormatter {

	@Override
	public String formate(String title, Map<String, String> kvInfo) {
		StringBuilder jsonBuilder = new StringBuilder();
		jsonBuilder.append("{\n");
		jsonBuilder.append("title:");
		jsonBuilder.append(title);
		jsonBuilder.append("\n");

		for(Map.Entry<String,String> entry :kvInfo.entrySet()){
			jsonBuilder.append(entry.getKey());
			jsonBuilder.append(":");
			jsonBuilder.append(entry.getValue());
			jsonBuilder.append("\n");
		}
		jsonBuilder.append("}\n");

		return jsonBuilder.toString();
	}
}
