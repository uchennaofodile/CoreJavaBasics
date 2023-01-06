package com.library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kid = new KidUsers();
		AdultUser adult = new AdultUser();
		kid.setAge(10);
		kid.registerAccount();
		kid.setAge(18);
		kid.registerAccount();
		kid.setBookType("Kids");
		kid.requestBook();
		kid.setBookType("Fiction");
		kid.requestBook();
		adult.setAge(5);
		adult.registerAccount();
		adult.setAge(23);
		adult.registerAccount();
		adult.setBookType("Kids");
		adult.requestBook();
		adult.setBookType("fiction");
		adult.requestBook();
		

	}

}
