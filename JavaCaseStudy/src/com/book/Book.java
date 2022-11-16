package com.book;

import java.util.Scanner;

import com.book.exception.InvalidBookException;

public class Book {

	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;

	Scanner sc = new Scanner(System.in);

	// default constructor of Book Object
	public Book() throws InvalidBookException {

		System.out.println("enter bookid");
		this.bookID = sc.nextLine();
		// validation
		// bookID must start with ‘B’ and must be of length 4 characters
		if (!(bookID.startsWith("B") && bookID.length() == 4)) {
			throw new InvalidBookException("InvalidBookException");
		}
		/*
		 * if (!bookID.startsWith("b") && bookID.length()!=4) { throw new
		 * InvalidBookException("InvalidBookException"); }
		 */

		System.out.println("enter booktitle");
		this.title = sc.nextLine();

		System.out.println("enter bookauthor");
		this.author = sc.nextLine();

		System.out.println("enter bookcategory");
		this.category = sc.nextLine();
		// validation
		if (!(category.contentEquals("Science")) && !(category.contentEquals("Fiction"))
				&& !(category.contentEquals("Technology")) && !(category.contentEquals("Others"))) {
			throw new InvalidBookException("InvalidBookException");
		}

		System.out.println("enter book price");
		this.price = sc.nextFloat();
		// validation
		if (price < 0) {
			throw new InvalidBookException("InvalidBookException");
		}

	}

	// parameterized constructor of Book object
	public Book(String bookID, String title, String author, String category, float price) {
		super();

		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	// getters and setters
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

}
