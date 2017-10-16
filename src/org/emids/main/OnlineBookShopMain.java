package org.emids.main;

import java.util.ArrayList;
import org.emids.domain.Book;
import org.emids.service.MainView;

public class OnlineBookShopMain {
	public static ArrayList<Book> bookcontainer = new ArrayList<Book>();

	public static void main(String[] args) {

		Book book1 = new Book("java", "James Goslings", 800);
		Book book2 = new Book("SCJP", "hugart", 500);
		Book book3 = new Book("Bigdata", "Morque", 350);
		Book book4 = new Book("Phython", "REgrno", 200);
		bookcontainer.add(book1);
		bookcontainer.add(book2);
		bookcontainer.add(book3);
		bookcontainer.add(book4);
		System.out.println(bookcontainer.size());
		MainView.option();
	}
}