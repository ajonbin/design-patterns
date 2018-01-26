package me.ajonbin.designpattern;

public class WeChatUser {
	protected String userId;
	protected String userName;
	protected String userNickName;
	protected String userEmail;

	public WeChatUser(String userId, String userName, String userNickName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userNickName = userNickName;
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public String getUserEmail() {
		return userEmail;
	}
}
