package me.ajonbin.designpattern.bridge;

import java.util.HashMap;
import java.util.Map;

public class RefinedAbstractionBookInfoPrinter extends AbstractionKeyValuePrinter{
	private BookInfo bookInfo;

	public RefinedAbstractionBookInfoPrinter(BookInfo bookInfo){
		this.bookInfo = bookInfo;
	}


	@Override
	protected Map<String, String> getKeyValue() {
		Map<String,String> kvMap = new HashMap<String,String>();
		kvMap.put("ISBN",bookInfo.ISBN);
		kvMap.put("author",bookInfo.author);
		kvMap.put("publisher",bookInfo.publisher);

		return kvMap;
	}

	@Override
	protected String getTitle() {
		return bookInfo.title;
	}
}
