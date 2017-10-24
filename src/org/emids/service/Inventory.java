package org.emids.service;

import java.util.Scanner;
import org.emids.domain.Book;
import org.emids.main.OnlineBookShopMain;;

public class Inventory {
	Scanner scanner = new Scanner(System.in);
	String option = null;
	Product product = new Product();

	public String searchByBookName() {
		System.out.println("enter the book name you want");
		String searchBookName = scanner.next();
		boolean isBookFound = false;

		for (int i = 0; i < OnlineBookShopMain.bookcontainer.size(); i++) {

			Book bokkNameSearched = OnlineBookShopMain.bookcontainer.get(i);
			if (searchBookName.equalsIgnoreCase(bokkNameSearched.getBookname())) {
				isBookFound = true;
				System.out.println(bokkNameSearched);
				System.out.println("press 1 for add to cart");
				int value = scanner.nextInt();
				if (value == 1) {
					ShoppingCart.addShopingCart(bokkNameSearched);
					System.out.println(bokkNameSearched + "is added to cart");
					break;
				}

			}

		}
		if (isBookFound == false) {
			System.out.println("Book not found");

		}
		return searchBookName;

	}
}
