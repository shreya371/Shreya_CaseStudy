package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.exception.InvalidBookException;

public class BookUtil {

	public static void main(String[] args) throws InvalidBookException {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		/*Book obj=new Book("B101","The Wings","APJ","Others",1000);
		System.out.println("done program");
		
		public Book addBook(Book b) {
			
		}
		ArrayList<Book> lt = new ArrayList<Book>();
		lt.add(obj);
		int ln=lt.size();
		System.out.println(obj.toString());
		System.out.println(lt.toString());*/
		///----------adding book-------------
		System.out.println("program started");
		Book ob1=new Book("B101","TheWings1","APJ1","Others1",1001);
		Book ob2=new Book("B102","TheWings2","APJ2","Others2",1002);
		Book ob3=new Book("B103","TheWings3","APJ3","Others3",1003);
		
		com.book.BookStore.addBook(ob1);
		com.book.BookStore.addBook(ob2);
		com.book.BookStore.addBook(ob3);
		
		//Book object= new Book();
		
		/*
		//-----------displaying all books------------
		System.out.println("--------------------------");
		com.book.BookStore.displayAll();
		System.out.println("------------------------");*/
		
		/*String title=sc.nextLine();
		
		com.book.BookStore.searchByTitle(title);*/
		
		/*String author=sc.nextLine();
		com.book.BookStore.searchByAuthor(author);*/
		
		/*String bookID="B103";
		com.book.BookStore.deleteBook(bookID);*/
		
		
		
		
		//com.book.BookStore.displayAll();
		
		/*String bookID="B103";
		String bookset="B111";
		com.book.BookStore.modifyBook(bookID,bookset);
		com.book.BookStore.displayAll();*/
		
		//Book ob= new Book();
		//com.book.BookStore.addBook(ob);
		//com.book.BookStore.displayAll();
		
		//-----------Menu Driven program---------------
		
		System.out.println("Enter 3 book details to continue");
		for (int i=0;i<3;i++) {
			
			com.book.BookStore.addBook(new Book());
			
		}
		com.book.BookStore.displayAll();
		
		System.out.println("1.Add Book \n2.Modify Book \n3.Delete Book \n4.Display All Books \n5.Display Specific Book"
				+ "\n6.Search Book by Title \n7.Search Book by Author\n8.Exit"
				);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		while(choice <9) {
			
		
		switch(choice) {
		case 1 : Book object= new Book();
		         com.book.BookStore.addBook(object);
		         break;
		         
		case 2 : //modify
			     System.out.println("enter book id");
			     String modifybookID=sc.next();
			     System.out.println("enter new book id");
				 String bookset=sc.next();
				 com.book.BookStore.modifyBook(modifybookID,bookset);
				 com.book.BookStore.displayAll();
				 break;
			     
		case 3 : //delete a book
			    System.out.println("enter book id");
			     String deletebookID=sc.next();
			     com.book.BookStore.deleteBook(deletebookID);
			     break;
		case 4 ://display all
			     com.book.BookStore.displayAll();
			     break;
		case 5 ://display specific book
			     System.out.println("enter book id");
			     String specificbookID=sc.nextLine();
			     com.book.BookStore.displayBook(specificbookID);
			     break;
		case 6 ://search title
			System.out.println("enter book title");
			String title=sc.next();
			com.book.BookStore.searchByTitle(title);
			break;
			
		case 7 ://search author
			System.out.println("enter book author");
			String author=sc.next();
			com.book.BookStore.searchByAuthor(author);
			break;
			
		case 8 : //exit
			System.out.println("program end");
			System.exit(0);
		
			
		
			
		}
	
		System.out.println("1.Add Book \n 2.Modify Book \n 3.Delete Book \n 4.Display All Books \n 5.Display Specific Book"
				+ "6.Search Book by Title \n 7.Search Book by Author\n 8.Exit"
				);
		System.out.println("process completed -enter choice");
		int ch=sc.nextInt();
		choice=ch;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
