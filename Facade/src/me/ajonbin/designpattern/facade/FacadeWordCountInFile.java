package me.ajonbin.designpattern.facade;

import java.io.*;

public class FacadeWordCountInFile {
	protected File file;

	public FacadeWordCountInFile(File file){
		this.file = file;
	}
	public int getWordCount(String word){
		try {
			//A decorator example
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();
			int wordCount = 0;

			while (line != null){
				String[] words = line.split(" ");
				for (String w : words){
					if(w.equals(word)){
						wordCount++;
					}
				}
				line = bufferedReader.readLine();
			}
			return wordCount;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return -1;
	}
}
