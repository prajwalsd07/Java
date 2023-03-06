package com.demo.Day13.buildermethod;

public class UserMain {

	public static void main(String[] args) {
		User user = new User.UserBuilder(123, "Sawad").build();
		User user1 = new User
				.UserBuilder(124, "moh")
				.email("dhbh")
				.city("dhdbg")
				.mobile("hgydfueg")
				.build();
		System.out.println(user);
	}
}
