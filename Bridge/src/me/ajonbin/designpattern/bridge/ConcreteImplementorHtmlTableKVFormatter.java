package me.ajonbin.designpattern.bridge;

import java.util.Map;

public class ConcreteImplementorHtmlTableKVFormatter implements ImplementorKeyValueFormatter{
	@Override
	public String formate(String title, Map<String, String> kvInfo) {
		StringBuilder htmlTableBuilder = new StringBuilder();
		htmlTableBuilder.append("<table>\n");
		htmlTableBuilder.append("<caption>\n");
		htmlTableBuilder.append("title" + "\n");
		htmlTableBuilder.append("</caption>\n");

		for(Map.Entry<String,String> entry : kvInfo.entrySet()){
			htmlTableBuilder.append("<tr>\n");
			htmlTableBuilder.append("<td>\n");
			htmlTableBuilder.append(entry.getKey() + "\n");
			htmlTableBuilder.append("</td>\n");
			htmlTableBuilder.append("<td>\n");
			htmlTableBuilder.append(entry.getValue() + "\n");
			htmlTableBuilder.append("</td>\n");
			htmlTableBuilder.append("</tr>\n");
		}

		htmlTableBuilder.append("</table>\n");
		return htmlTableBuilder.toString();
	}
}
