package com.cdac.library.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cdac.library.enums.BookType;
import com.cdac.library.exceptions.BookNotFoundException;
import com.cdac.library.exceptions.BookQuantityLowException;
import com.cdac.library.exceptions.DuplicateBooksException;
import com.cdac.library.objects.Book;
import com.cdac.library.utils.BooksUtil;
import com.cdac.library.utils.DateUtils;

public class LibraryHashMap {

	public static void main(String[] args) {

		Map<String, Book> books = new HashMap<>();
		books.putAll(BooksUtil.getBooks());
		Scanner sc = new Scanner(System.in);

		DateUtils ut = new DateUtils();

		int ch;
		do {

			System.out.println("Enter Option : ");
			System.out.println("1. Add book.");
			System.out.println("2. Display All books.");
			System.out.println("3. Allot book to student.");
			System.out.println("4. Take book return.");
			System.out.println("5. Remove book.");
			System.out.println("0. Exit Application.");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1: {
				System.out.println("Enter Book title");
				String title = sc.nextLine();

				System.out.println("Enter Book Type");
				String booktype = sc.nextLine();

				System.out.println("Enter Book Price");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Book publishing Date");
				String pubDate = sc.nextLine();

				System.out.println("Enter Book Author Name");
				String authorName = sc.nextLine();

				System.out.println("Enter Book Quantity");
				Integer quantity = sc.nextInt();
				sc.nextLine();
				try {
				addBook(books,title, booktype, price, pubDate, authorName,quantity);
				}catch (DuplicateBooksException e) {
					System.out.println(e.getMessage());
				}

				break;
			}
			case 2: {
				Set<String> keys = books.keySet();
				for (String title : keys) {
					System.out.println( books.get(title));
				}

				break;
			}
			case 3: {
				System.out.println("Enter Book Title to Allot : ");
				String booktitle = sc.nextLine();
				try {
					if (allotBook(books, booktitle)) {
						System.out.println("Collect Book");
						System.out.println(books.get(booktitle));
					}
				} catch (BookNotFoundException | BookQuantityLowException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 4: {
				System.out.println("Enter Book Title to Return : ");
				String booktitle = sc.nextLine();
				try {
					if (returnBook(books, booktitle)) {
						System.out.println("Thank you for returning Book");
					}
				} catch (BookNotFoundException | BookQuantityLowException e) {
					System.out.println(e.getMessage());
				}

				break;
			}
			case 5: {
				System.out.println("Enter Book Title to Return : ");
				String booktitle = sc.nextLine();
				try {
					if (removeBook(books, booktitle)) {
						System.out.println("Book Successfully Removed from Library");
					}
				} catch (BookNotFoundException e) {
					System.out.println(e.getMessage());
				}

				break;
			}
			case 0: {
				System.out.println("Thank you for visiting Library");
				break;
			}
			default: {
				System.out.println("Invalid Option");
				break;
			}
			}

		} while (ch != 0);

		System.out.println(books);

	}

	public static boolean allotBook(Map<String, Book> books, String booktitle)
			throws BookNotFoundException, BookQuantityLowException {

		if (books.get(booktitle) == null) {
			throw new BookNotFoundException("Book Not Found :: Please Enter the Correct title");
		}

		books.get(booktitle).setQuantity(books.get(booktitle).getQuantity() - 1);
		return true;

	}

	public static boolean returnBook(Map<String, Book> books, String booktitle)
			throws BookNotFoundException, BookQuantityLowException {

		if (books.get(booktitle) == null) {
			throw new BookNotFoundException("Book Not Found :: Please Enter the Correct title");
		}

		books.get(booktitle).setQuantity(books.get(booktitle).getQuantity() + 1);
		return true;

	}

	public static boolean removeBook(Map<String, Book> books, String booktitle) throws BookNotFoundException {

		if (books.get(booktitle) == null) {
			throw new BookNotFoundException("Book Not Found :: Please Enter the Correct title");
		}

		books.remove(booktitle);
		return true;

	}
	
	public static boolean addBook(Map<String, Book> books,String title, String bookType, Double price, String publishedDate, String authorName,
			Integer quantity) throws DuplicateBooksException {
		if (books.containsKey(title)) {
			throw new DuplicateBooksException("Book Already Present in Library");
		}


		books.putIfAbsent(title, new Book(title, BookType.valueOf(bookType.toUpperCase()), price, publishedDate, authorName,
				quantity));
		return true;

	}

}
