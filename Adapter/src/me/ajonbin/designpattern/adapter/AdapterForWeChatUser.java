package me.ajonbin.designpattern.adapter;

public class AdapterForWeChatUser implements IUser{
	protected WeChatUser user;

	public AdapterForWeChatUser(WeChatUser user) {
		this.user = user;
	}

	@Override
	public String getId() {
		return user.getUserId();
	}

	@Override
	public String getUserName() {
		return user.getUserName();
	}

	@Override
	public String getNickName() {
		return user.getUserNickName();
	}

	@Override
	public String getMail() {
		return user.getUserEmail();
	}
}
