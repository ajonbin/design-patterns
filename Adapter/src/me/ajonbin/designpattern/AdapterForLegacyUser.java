package me.ajonbin.designpattern;

public class AdapterForLegacyUser implements IUser{
	protected LegacyVersionUser user = null;


	public AdapterForLegacyUser(LegacyVersionUser user) {
		this.user = user;
	}

	@Override
	public String getId() {
		return user.getName();
	}

	@Override
	public String getUserName() {
		return user.getName();
	}

	@Override
	public String getNickName() {
		return user.getNickname();
	}

	@Override
	public String getMail() {
		return user.getMail();
	}
}
