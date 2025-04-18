package com.cdac.library.utils;

import java.util.HashMap;
import java.util.Map;

import com.cdac.library.enums.BookType;
import com.cdac.library.objects.Book;

public class BooksUtil {
	public static Map<String,Book> getBooks() {
		
		Map<String,Book> books=new HashMap<String,Book>();
		
		Book b1=new Book("The Silent Patient", BookType.THRILLER, 1599.0, "2019-02-05", "Alex Michaelides", 10);
		books.put( b1.getTitle() , b1);
		
		Book b2=new Book("Where the Crawdads Sing", BookType.FICTION, 1299.0, "2018-08-14", "Delia Owens", 8);
		books.put(b2.getTitle() , b2);
	       
		Book b3=new Book("The Vanishing Half", BookType.FICTION, 1699.0, "2020-06-02", "Brit Bennett", 5);		
         books.put(b3.getTitle() , b3);
         
         Book b4=new Book("Educated", BookType.NON_FICTION, 1899.0, "2018-02-20", "Tara Westover", 7);
        books.put(b4.getTitle() , b4);
        
        Book b5=new Book("Dune", BookType.SCI_FI, 1499.0, "1965-08-01", "Frank Herbert", 12);
        books.put(b5.getTitle() , b5);
        
        Book b6=new Book("The Night Circus", BookType.FANTASY, 1799.0, "2011-09-13", "Erin Morgenstern", 6);
        books.put(b6.getTitle() , b6);
        
        Book b7=new Book("Becoming", BookType.NON_FICTION, 2499.0, "2018-11-13", "Michelle Obama", 4);
        books.put(b7.getTitle() , b7);
        
        Book b8=new Book("The Girl with the Dragon Tattoo", BookType.FICTION, 1999.0, "2005-08-01", "Stieg Larsson", 9);
        books.put(b8.getTitle() , b8);
        
        Book b9=new Book("The Alchemist", BookType.FICTION, 1099.0, "1988-04-01", "Paulo Coelho", 15);
        books.put(b9.getTitle() , b9);
        
        Book b10=new Book("The Power of Habit", BookType.NON_FICTION, 1699.0, "2012-02-28", "Charles Duhigg", 11);
        books.put(b10.getTitle() , b10);
        
        Book b11=new Book("Harry Potter ",BookType.FANTASY,1999.9, "1989-09-12" ,"Charles gihg",12);
        books.put(b11.getTitle() , b11);
		return books;
	}
	
}
