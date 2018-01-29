package me.ajonbin.designpattern.bridge;

import java.util.Map;

public interface ImplementorKeyValueFormatter {
	String formate(String title, Map<String, String> kvInfo);
}
