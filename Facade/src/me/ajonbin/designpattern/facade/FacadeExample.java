package me.ajonbin.designpattern.facade;

import java.io.File;

public class FacadeExample {
	public static void FacadeClient(){
		File f = new File("FacadeExample.txt");

		//Simplify the usage of get word count
		FacadeWordCountInFile facadeWordCountInFile = new FacadeWordCountInFile(f);
		int wordCount = facadeWordCountInFile.getWordCount("pattern");

		System.out.println(String.format("There are %d pattern in file",wordCount));

	}
	public static void main(String[] args){
		FacadeClient();
	}
}
