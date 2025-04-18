package com.cdac.library.objects;

import java.time.LocalDate;

import com.cdac.library.enums.BookType;
import com.cdac.library.exceptions.BookQuantityLowException;
import com.cdac.library.utils.DateUtils;

public class Book {
	private String title;
	private BookType bookType;
	private Double price;
	private LocalDate publishedDate;
	private String authorName;
	private Integer	quantity;
	
	
	public Book() {
		super();
	}
	public Book(String title, BookType bookType, Double price, String publishedDate, String authorName,
			Integer quantity) {
		super();
		this.title = title;
		this.bookType = bookType;
		this.price = price;
		this.publishedDate = DateUtils.getLocalDate(publishedDate);
		this.authorName = authorName;
		this.quantity = quantity;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the bookType
	 */
	public BookType getBookType() {
		return bookType;
	}
	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the publishedDate
	 */
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	
	public String getStringPublishedDate() {
		return DateUtils.getStringLocalDate(publishedDate);
	}
	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public void setStringPublishedDate(String publishedDate) {
		this.publishedDate = DateUtils.getLocalDate(publishedDate);
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 * @throws BookQuantityLowException 
	 */
	public void setQuantity(Integer quantity) throws BookQuantityLowException {
		if(quantity<1) {
			throw new BookQuantityLowException("Book Not Available");
		}
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookType=" + bookType + ", price=" + price + ", publishedDate="
				+ publishedDate + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
