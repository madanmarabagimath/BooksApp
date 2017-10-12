package org.emids.service;

import java.util.Scanner;
import org.emids.domain.Book;
import org.emids.domain.Customer;;

public class Inventory {
	Scanner scanner = new Scanner(System.in);
	String option = null;

	public String searchByBookName(String bookName) {
		System.out.println("enter the book name you want");
		String option = scanner.nextLine();
		if (option.equalsIgnoreCase(bookName)) {
			System.out.println(
					"book found you want to add it to the cart or add to it order by selecting option provded in menu");
			return option;
		} else
			System.out.println("oops book not found");
		return null;
	}

	public String searchByBookAuthoerName(String authoerName) {
		System.out.println("enter the authoerName you want");
		String option = scanner.nextLine();
		if (option.equalsIgnoreCase(authoerName)) {
			System.out.println(
					"book found you want to add it to the cart or add to it order by selecting option provded in menu");
			return option;

		} else {
			System.out.println("oops book not found");
		}
		return null;

	}

}
