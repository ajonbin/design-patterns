package me.ajonbin.designpattern.adapter;

public class AdapterForLegacyUser implements IUser{
	protected AdapteeLegacyVersionUser user = null;


	public AdapterForLegacyUser(AdapteeLegacyVersionUser user) {
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
