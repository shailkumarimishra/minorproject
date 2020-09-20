package com.onlinelibrary.client;

import java.util.Scanner;

import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.model.UserModel;
import com.onlinelibrary.service.UserService;

public class ClientAccount {

	public static void main(String[] args) {
		String username = null;
		String password = null;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter username: ");
			username = sc.next();
			System.out.print("Enter password: ");
			password = sc.next();
		}

		UserModel user = new UserModel(username, password);
		UserService service = BookFactory.getServiceInstance();
		String result = service.verifyUser(user);
		System.out.println(result);
	}

}
