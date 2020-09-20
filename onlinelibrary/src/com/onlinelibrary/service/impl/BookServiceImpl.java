package com.onlinelibrary.service.impl;

import java.util.List;

import com.onlinelibrary.constant.Message;
import com.onlinelibrary.dao.BookDao;
import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.mapper.BookMapper;
import com.onlinelibrary.model.BookModel;
import com.onlinelibrary.response.Response;
import com.onlinelibrary.service.BookService;
import com.onlinelibrary.util.MessageBundle;

/**
 * BookServiceImpl implements BookService.
 * 
 * @author Shail Mishra
 *
 */
public class BookServiceImpl implements BookService {
	private BookDao dao;
	private BookMapper map;

	public BookServiceImpl() {
		this.dao = BookFactory.getBookDaoInstance();
		this.map = BookFactory.getBookMapperInstance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String addBook(BookModel book) {
		Response res = dao.addBook(map.mapToEntity(book));
		if (res.isSuccess())
			return MessageBundle.getMessage(Message.BOOK_ADDED);
		else
			return MessageBundle.getMessage(Message.BOOK_NOT_ADDED);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public String addBook(List<BookModel> books) {
		Response res = dao.addBook(map.mapToBookEntity(books));
		if (res.isSuccess())
			return MessageBundle.getMessage(Message.BOOK_ADDED);
		else
			return MessageBundle.getMessage(Message.BOOK_NOT_ADDED);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public String updateBook(BookModel book) {
		Response res = dao.updateBook(map.mapToEntity(book));
		if (res.isSuccess())
		
			return MessageBundle.getMessage(Message.BOOK_UPDATED);
		else
			return MessageBundle.getMessage(Message.BOOK_NOT_UPDATED);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public String deleteBookById(String bookId) {
		Response res = dao.deleteBookById(bookId);
		if (res.isSuccess())
			return MessageBundle.getMessage(Message.BOOK_DELETED);
		else
			return MessageBundle.getMessage(Message.BOOK_NOT_DELETED);

	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public String deleteBookByNameAndAuthor(String book, String author) {
		Response res = dao.deleteBookByNameAndAuthor(book, author);
		if (res.isSuccess())
			return MessageBundle.getMessage(Message.BOOK_DELETED);
		else
			return MessageBundle.getMessage(Message.BOOK_NOT_DELETED);
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookModel> getBookByAuthor(String author) {
		return map.mapToBook(dao.getBookByAuthor(author));
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookModel> getBookByAuthorAndEdition(String author, String edition) {
		return map.mapToBook(dao.getBookByAuthorAndEdition(author, edition));
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookModel> getBookByAuthorAndPublication(String author, String publication) {
		return map.mapToBook(dao.getBookByAuthorAndPublication(author, publication));
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public BookModel getBookByBookId(String book) {
		return map.mapToModel(dao.getBookByBookId(book));
	}
	/**
	 * {@inheritDoc}
	 */

	@Override
	public List<BookModel> getAllBook() {
		return map.mapToBook(dao.getAllBook());
	}

}
