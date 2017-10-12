package org.emids.service;

import java.util.Scanner;

import org.emids.domain.Customer;

public class Order {
	Scanner scanner = new Scanner(System.in);

	public void orders() {
		Inventory invent = new Inventory();
		System.out.println("your r order placed successfully");
		System.out.println("eneter the number copies ");
		System.out.println("your order details is as follows");
		System.out.println("how many no of copies required");
		int copy = scanner.nextInt();
		System.out.println(new Customer() + "name of the book" + invent.option + "no of the copies" + copy);
		System.out.println("Thank you for Shopping");

	}

}
