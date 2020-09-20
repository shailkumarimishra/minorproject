package com.onlinelibrary.dao.impl;

import java.util.List;

import com.onlinelibrary.dao.BookDao;
import com.onlinelibrary.dao.template.JdbcTemplate;
import com.onlinelibrary.entity.BookEntity;
import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.response.Response;
/**
 * BookDaoImpl implements BokDao
 * 
 * @author Shail Mishra
 *
 */
public class BookDaoImpl implements BookDao {
	private JdbcTemplate temp;

	public BookDaoImpl() {
		this.temp = BookFactory.getJdbcTemplateInstance();
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public Response addBook(BookEntity book) {
		Response res = temp.saveBook(book);
		return res;
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public Response addBook(List<BookEntity> books) {
		Response res = temp.saveBook(books);
		return res;
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public Response updateBook(BookEntity book) {
		Response res = temp.updateBook(book);
		return res;
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public Response deleteBookById(String bookId) {
		Response res = temp.deleteBook(bookId);
		return res;
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public Response deleteBookByNameAndAuthor(String book, String author) {
		Response res = temp.deleteBook(book, author);
		return res;
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookEntity> getBookByAuthor(String author) {
		return temp.getByAuthor(author);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookEntity> getBookByAuthorAndEdition(String author, String edition) {
		return temp.getByAuthorAndEdition(author, edition);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookEntity> getBookByAuthorAndPublication(String author, String publication) {
		return temp.getByAuthorAndPublication(author, publication);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public BookEntity getBookByBookId(String book) {
		return temp.getBookByBookId(book);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookEntity> getAllBook() {
		return temp.getAllBook();
	}

}
