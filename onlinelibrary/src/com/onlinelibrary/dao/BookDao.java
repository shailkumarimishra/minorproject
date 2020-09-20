package com.onlinelibrary.dao;

import java.util.List;

import com.onlinelibrary.entity.BookEntity;
import com.onlinelibrary.exception.DataAccessException;
import com.onlinelibrary.response.Response;

/**
 * <h1>UserDao exposes services related to user.</h1>
 * 
 * @author Shail Mishra
 * @version 1.0
 * @since 12-04-2020
 *
 */
public interface BookDao {
	/**
	 * addBook takes a BookEntity object and saves it
	 * 
	 * @param book an object of BookEntity to be retained
	 * @return Response {@link Response}, if added return true else return false
	 */
	public abstract Response addBook(BookEntity book);

	/**
	 * addBook takes a list of BookEntity object and saves it
	 * 
	 * @param books containing objects of BookEntity to be retained.
	 * @return Response {@link Response}, if added return true else return false
	 */

	public abstract Response addBook(List<BookEntity> book);

	/**
	 * updateBook takes a BookEntity object and update it
	 * 
	 * @param book an object of BookEntity to be updated
	 * @return Response {@link Response}, if updated return true else return false
	 * @throws DataAccessException if the <tt>update</tt> operation is not
	 *                             supported.
	 */

	public abstract Response updateBook(BookEntity book);

	/**
	 * deleteBookById takes bookId and delete it
	 * 
	 * @param bookId bookId to be deleted if present.
	 * @return Response {@link Response}, if deleted return true else return false
	 * @throws DataAccessException if the <tt> delete </tt> operation is not
	 *                             supported.
	 */

	public abstract Response deleteBookById(String bookId);

	/**
	 * deleteBookByNameAndAuthor takes book and author to be deleted.
	 * 
	 * @param book   book to be deleted if present.
	 * @param author author to be deleted if present.
	 * @return Response {@link Response}, if deleted return true else return false
	 * @throws DataAccessException if the <tt> delete </tt> operation is not
	 *                             supported.
	 */

	public abstract Response deleteBookByNameAndAuthor(String book, String author);

	/**
	 * getBookByAuthor takes author and return list of books
	 * 
	 * @param author author whose books to be retained
	 * @return list of books.
	 */

	public abstract List<BookEntity> getBookByAuthor(String author);

	/**
	 * getBookByAuthorAndEdition takes author and edition to be fetched and return
	 * list of books.
	 * 
	 * @param author  author whose books to be retained
	 * @param edition edition to be retained
	 * @return list of books.
	 */

	public abstract List<BookEntity> getBookByAuthorAndEdition(String author, String edition);

	/**
	 * getBookByAuthorAndPublication takes author and publication to be fetched and
	 * return list of books
	 * 
	 * @param author      author whose books to be retained
	 * @param publication publication to be retained
	 * @return list of books
	 */

	public abstract List<BookEntity> getBookByAuthorAndPublication(String author, String publication);

	/**
	 * getBookByBookId takes bookId and return book
	 * 
	 * @param bookId book to be fetched
	 * @return book an object of BookModel
	 */

	public abstract BookEntity getBookByBookId(String book);

	/**
	 * getAllBook fetch list of book
	 * 
	 * @return list of book
	 */

	public abstract List<BookEntity> getAllBook();
}
