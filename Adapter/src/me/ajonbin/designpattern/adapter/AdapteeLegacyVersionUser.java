package me.ajonbin.designpattern.adapter;

public class AdapteeLegacyVersionUser {
	protected String mail;
	protected String name;
	protected String nickname;

	public AdapteeLegacyVersionUser(String mail, String name, String nickname) {
		this.mail = mail;
		this.name = name;
		this.nickname = nickname;
	}

	public String getMail() {
		return mail;
	}

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}
}
