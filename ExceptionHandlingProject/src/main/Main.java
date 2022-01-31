package main;

import business.concretes.UserManager;
import dataAccess.concretes.UserSqlImpl;
import entities.concretes.User;
import exception.BusinessException;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new UserSqlImpl());
		User user1 = new User(1, "FirstName1", "LastName1", "mail1@", "123456");
		User user2 = new User(2, "FirstName2", "LastName2", "mail2@", "123456");
		User user3 = new User(3, "FirstName3", "LastName3", "mail3@", "123456");
		User user4 = new User(4, "F", "LastName4", "mail4@", "123456");

		try {
			userManager.add(user1);
			userManager.add(user2);
			userManager.add(user3);
			userManager.add(user4);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
