package com.onlinelibrary.client;

import java.util.Arrays;
import java.util.List;

import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.model.BookModel;
import com.onlinelibrary.service.BookService;

public class Client {

	public static void main(String[] args) {
		BookModel book=new BookModel("cd001","CompilerDesign", "DR.PK", "JKpublication","vol I" ,880);
		BookService srv = BookFactory.getBookServiceInstance();
		String result = srv.addBook(book);
		System.out.println(result);
		List<BookModel> li = Arrays.asList(new BookModel("os007", "OS", "DR.Rao", "JKpublication", "vol I", 880),
				new BookModel("os008", "OS", "DR.Rao", "JKpublication", "vol I", 880),
				new BookModel("os010", "OS", "DR.Rao", "JKpublication", "vol I", 880),
				new BookModel("os011", "OS", "DR.Rao", "JKpublication", "vol I", 880),
				new BookModel("os012", "OS", "DR.Rao", "JKpublication", "vol I", 880));
//		String result = srv.addBook(li);
//		System.out.println(result);
		/*
		 * BookModel book=new BookModel(); book.setBookId("pm103"); book.setCost(700);
		 * String update = srv.updateBook(book); System.out.println(update);
		 */
//		String delete = srv.deleteBookById("pm101");
//	String delete = srv.deleteBookByNameAndAuthor("OS","DR.Rao");
//		System.out.println(delete);
		/*
		 * List<BookModel> bookByAuthor = srv.getBookByAuthor("DR.Rao");
		 * bookByAuthor.forEach(System.out::println);
		 */
//		List<BookModel> books = srv.getBookByAuthorAndEdition("DR.Rao","vol I");
//		books.forEach(System.out::println);
//		System.out.println(srv.getBookByBookId("os007"));
//		List<BookModel> allBook = srv.getAllBook();
//		allBook.forEach(System.out::println);
//		List<BookModel> allBook = srv.getBookByAuthorAndPublication("DR.Rao", "JKpublication");
//		allBook.forEach(System.out::println);

	}

}
