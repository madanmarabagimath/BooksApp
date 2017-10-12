package org.emids.service;
import java.util.ArrayList;

import org.emids.domain.*;
public class Product
{
	static ArrayList<Book> bookcontainer=new ArrayList<Book>();
	{
	Book book1=new Book();
	book1.setBookname("java");
	book1.setAuthoername("james");
	book1.setPrice(4000);
	
	Book book2=new Book();
	book2.setBookname("Advance Java");
	book2.setAuthoername("james Goslings");
	book2.setPrice(5000);
	
	bookcontainer.add(book1);
	bookcontainer.add(book2);
	}
}
