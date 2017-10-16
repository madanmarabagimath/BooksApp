package org.emids.service;

import java.util.Scanner;

public class CustomerBookShelf {
	Scanner scanner = new Scanner(System.in);

	public void bookShelf() {
		System.out.println("enter the book type means java or phython or bigdata etc");
		String options = scanner.nextLine();
		if (options.equalsIgnoreCase("java")) {
			System.out.println("it is succesfully added to shelf no 1 u can find it later");
		} else if (options.equalsIgnoreCase("phython")) {
			System.out.println("it is succesfully added to shelf no 2 u can find it later");
		} else if (options.equalsIgnoreCase("bigdata")) {
			System.out.println("it is succesfully added to shelf no 3 u can find it later");
		}

	}

}