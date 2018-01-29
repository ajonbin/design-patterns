package me.ajonbin.designpattern.bridge;

import java.util.HashMap;
import java.util.Map;

public class RefinedAbstractionUserInfoPrinter extends AbstractionKeyValuePrinter{

	private UserInfo userInfo;
	public RefinedAbstractionUserInfoPrinter(UserInfo userInfo){
		this.userInfo = userInfo;
	}

	@Override
	protected Map<String, String> getKeyValue() {
		Map<String,String> kvMap = new HashMap<String,String>();
		kvMap.put("age",String.valueOf(userInfo.age));
		kvMap.put("mail",userInfo.mail);
		kvMap.put("phone",userInfo.phone);

		return kvMap;
	}

	@Override
	protected String getTitle() {
		return userInfo.name;
	}
}
