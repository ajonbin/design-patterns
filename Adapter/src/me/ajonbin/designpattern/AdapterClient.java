package me.ajonbin.designpattern;

import java.util.ArrayList;
import java.util.List;

public class AdapterClient {

    public static void main(String[] args) {
			System.out.println("Adapter Pattern Example");

			List<IUser> users = new ArrayList<IUser>();


			CurrentVersionUser currentVersionUser = new CurrentVersionUser("121","John","JohnL","john@designpatter.com");
			users.add(currentVersionUser);

			LegacyVersionUser legacyVersionUser = new LegacyVersionUser("Teddy@dp.com","Teddy","TTeddy");
			users.add(new AdapterForLegacyUser(legacyVersionUser));

			WeChatUser weChatUser = new WeChatUser("122","Martin","Martin","martin@designpatter.com");
			users.add(new AdapterForWeChatUser(weChatUser));

			for(IUser user : users){
				System.out.println(String.format("{ID:%s,\tName:%s,\tNickName:%s,\tMail:%s}",
					user.getId(),
					user.getUserName(),
					user.getNickName(),
					user.getMail()));
			}

    }
}
