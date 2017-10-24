package org.emids.service;

import java.util.Scanner;

public class MainView {
	

	public static void option() {
		 Product product = new Product();
	     Inventory inventory = new Inventory();
	     Inventory1 inventory1 = new Inventory1();

		menuOption();
		switchCaseOption(product, inventory, inventory1);

	}

	private static void switchCaseOption(Product product, Inventory inventory, Inventory1 inventory1) {
		Scanner scanner = new Scanner(System.in);
		int menu = scanner.nextInt();
		switch (menu) {
		case 1:
			product.viewProdact();
			MainView.option();
			break;
		case 2:
			System.out.println("press 1 for search by bookName or 2 for search by Authoer name");
			int check = scanner.nextInt();
			if (check == 1) {
				inventory.searchByBookName();
			} else if (check == 2) {
				inventory1.searchByBookAuthoerName();
			}
			MainView.option();
			break;
		case 3:
			CustomerBookShelf customerBookShelf = new CustomerBookShelf();
			customerBookShelf.bookShelf();
			MainView.option();
			break;
		case 4:
			ShoppingCart shoppingCart = new ShoppingCart();
			ShoppingCart.shoopingCartDetails();
			MainView.option();
		case 5:
			Order order = new Order();
			order.orders();
			System.out.println(" press 1 for get order details");
			int value = scanner.nextInt();
			if (value == 1) {
				ShoppingCart.showDetailsOfOrder();
			}
			MainView.option();
			break;
		case 6:
			Payment.makePayment();
			MainView.option();
			break;
		case 7:
			product.exit();
			System.exit(0);
		default:
			System.out.println("Plesae enter correct option");
			break;
		}
	}

	private static void menuOption() {
		System.out.println("\nMenu - Managing a List");
		System.out.println("1 view BOOKS");
		System.out.println("2 sarch books");
		System.out.println("3 TO ADD BOOK TO SHELF");
		System.out.println("4 TO view cart details");
		System.out.println("5 TO PLACE A ORDER");
		System.out.println("6 TO PLACE Make Payment");
		System.out.println("7 TO EXIT");
		System.out.println("Select a menu option");
	}

}