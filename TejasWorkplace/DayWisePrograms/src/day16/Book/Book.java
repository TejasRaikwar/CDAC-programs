package day16.Book;
import java.time.LocalDate;

import day16.Book.Enums.BookType;
import day16.Book.Exceptions.LowBookQuantityException;

public class Book {
	private String title;
	private BookType bookType;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	
	public Book(String title, BookType bookType, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.bookType = bookType;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) throws LowBookQuantityException{
		if(quantity < 1)
			throw new LowBookQuantityException("Book not availabe.");
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookType=" + bookType + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
		
	
}
