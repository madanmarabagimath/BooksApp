package org.emids.service;

import org.emids.domain.Book;
import org.emids.main.OnlineBookShopMain;

public class Inventory1 extends Inventory {
	public void searchByBookAuthoerName() {
		System.out.println("enter the book Authoername you want");
		String searchBookAuthoerName = scanner.next();
		boolean isBookFound = false;

		for (int i = 0; i < OnlineBookShopMain.bookcontainer.size(); i++) {

			Book bookAuthoerNameSearched = OnlineBookShopMain.bookcontainer.get(i);
			if (searchBookAuthoerName.equalsIgnoreCase(bookAuthoerNameSearched.getBookname())) {
				isBookFound = true;
				System.out.println(bookAuthoerNameSearched);
				System.out.println("press 1 for add to cart");
				int value = scanner.nextInt();
				if (value == 1) {
					ShoppingCart.addShopingCart(bookAuthoerNameSearched);
					System.out.println(bookAuthoerNameSearched + "is added to cart");
					break;
				}

			}

		}
		if (isBookFound == false) {
			System.out.println("Book not found");

		}

	}
}
