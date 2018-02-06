package me.ajonbin.designpattern.iterator;

import java.util.Iterator;

public class FoodStore implements Iterable<String> {

	private String[] store = new String[100];
	private int storeTailIndex = 0;

	public void addFood(String food) throws Exception {
		if(storeTailIndex >= 99){
			throw new Exception("Store Full");
		}else{
			store[storeTailIndex++] = food;
		}
	}
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int currentIndex = 0;
			@Override
			public boolean hasNext() {
				return currentIndex < storeTailIndex;
			}

			@Override
			public String next() {
				return store[currentIndex++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Not implemented yet");
			}
		};
	}
}
