package me.ajonbin.designpattern;

public class CurrentVersionUser implements IUser{
	protected String id;
	protected String userName;
	protected String nickName;
	protected String email;

	public CurrentVersionUser(String id, String userName, String nickName, String email) {
		this.id = id;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getNickName() {
		return nickName;
	}

	@Override
	public String getMail() {
		return email;
	}
}
