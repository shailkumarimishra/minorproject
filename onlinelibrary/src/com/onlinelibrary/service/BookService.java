package com.onlinelibrary.service;

import java.util.List;

import com.onlinelibrary.model.BookModel;

/**
 * <h1>BookService exposes services related to book</h1>
 * 
 * @author Shail Mishra
 * @version 1.0
 * @since 12-04-2020
 *
 */
public interface BookService {
	/**
	 * addBook takes a BookModel object and saves it
	 * 
	 * @param book an object of BookModel to be retained
	 * @return String , if added return "Book Added Successfully" else return "Book
	 *         Not Added"
	 */
	public abstract String addBook(BookModel book);

	/**
	 * addBook takes a list of BookModel object and saves it
	 * 
	 * @param books containing objects of BookModel to be retained.
	 * @return String , if added return "Book Added Successfully" else return "Book
	 *         Not Added"
	 */

	public abstract String addBook(List<BookModel> books);

	/**
	 * updateBook takes a BookModel object and update it
	 * 
	 * @param book an object of BookModel to be updated
	 * @return String , if updated return "Book updated Successfully" else return
	 *         "Book Not Updated"
	 * @throws DataAccessException if the <tt>update</tt> operation is not
	 *                             supported.
	 */

	public abstract String updateBook(BookModel book);

	/**
	 * deleteBookById takes bookId and delete it
	 * 
	 * @param bookId bookId to be deleted if present.
	 * @return String , if deleted return "Book deleted Successfully" else return
	 *         "Book Not Deleted"
	 * @throws DataAccessException if the <tt> delete </tt> operation is not
	 *                             supported.
	 */

	public abstract String deleteBookById(String bookId);

	/**
	 * deleteBookByNameAndAuthor takes book and author to be deleted.
	 * 
	 * @param book   book to be deleted if present.
	 * @param author author to be deleted if present.
	 * @return String , if deleted return "Book deleted Successfully" else return
	 *         "Book Not Deleted"
	 * @throws DataAccessException if the <tt> delete </tt> operation is not
	 *                             supported.
	 */

	public abstract String deleteBookByNameAndAuthor(String book, String author);

	/**
	 * getBookByAuthor takes author and return list of books
	 * 
	 * @param author author whose books to be retained
	 * @return list of books.
	 */

	public abstract List<BookModel> getBookByAuthor(String author);

	/**
	 * getBookByAuthorAndEdition takes author and edition to be fetched and return
	 * list of books.
	 * 
	 * @param author  author whose books to be retained
	 * @param edition edition to be retained
	 * @return list of books.
	 */

	public abstract List<BookModel> getBookByAuthorAndEdition(String author, String edition);

	/**
	 * getBookByAuthorAndPublication takes author and publication to be fetched and
	 * return list of books
	 * 
	 * @param author      author whose books to be retained
	 * @param publication publication to be retained
	 * @return list of books
	 */

	public abstract List<BookModel> getBookByAuthorAndPublication(String author, String publication);

	/**
	 * getBookByBookId takes bookId and return book
	 * 
	 * @param bookId book to be fetched
	 * @return book an object of BookModel
	 */

	public abstract BookModel getBookByBookId(String bookId);

	/**
	 * getAllBook fetch list of book
	 * 
	 * @return list of book
	 */

	public abstract List<BookModel> getAllBook();
}
