package com.demo.buildermethod;

public class EmailMain {

	public static void main(String[] args) {
		Email email = new Email.EmailBuilder()
				.setFrom("sawad@.com")
				.setTo("rferg")
				.setContent("dgewydge")
				.setSubject("hffu").build();
				
	}
}
