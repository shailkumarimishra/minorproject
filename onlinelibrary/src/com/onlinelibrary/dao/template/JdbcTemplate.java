package com.onlinelibrary.dao.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlinelibrary.constant.Message;
import com.onlinelibrary.dao.constant.QueryConstant;
import com.onlinelibrary.dao.util.JdbcUtil;
import com.onlinelibrary.entity.BookEntity;
import com.onlinelibrary.entity.UserEntity;
import com.onlinelibrary.exception.DataAccessException;
import com.onlinelibrary.exception.ErrorMessage;
import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.response.Response;
import com.onlinelibrary.sqlqueries.SQLQuery;
import com.onlinelibrary.util.MessageBundle;
/**
 * JdbcTemplate 
 * @author Shail Mishra
 *
 */
public class JdbcTemplate {
	private Response res;
	private ErrorMessage error;

	public JdbcTemplate() {
		this.res = BookFactory.getResponseInstance();
		this.error = BookFactory.getErrorMessageInstance();
	}

	public Response verifyUser(UserEntity user) {
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_USER)) {
			ps.setString(QueryConstant.ONE, user.getUsername());
			ps.setString(QueryConstant.TWO, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				res.setSuccess(true);
			} else
				res.setSuccess(false);
		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.INVALID_ACCOUNT));
			throw new DataAccessException(error);
		}
		return res;
	}

	public Response saveBook(BookEntity book) {
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.INSERT_BOOK)) {
			buildBook(book, ps);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.BOOK_ADDED));
		}
		res.setSuccess(true);
		return res;
	}

	private void buildBook(BookEntity book, PreparedStatement ps) throws SQLException {
		ps.setString(QueryConstant.ONE, book.getBookId());
		ps.setString(QueryConstant.TWO, book.getBookName());
		ps.setString(QueryConstant.THREE, book.getAuthorName());
		ps.setString(QueryConstant.FOUR, book.getPublication());
		ps.setString(QueryConstant.FIVE, book.getEdition());
		ps.setDouble(QueryConstant.SIX, book.getCost());
	}

	public Response saveBook(List<BookEntity> books) {
		int[] records = null;
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.INSERT_BOOK)) {
			for (BookEntity book : books) {
				buildBook(book, ps);
				ps.addBatch();
			}
			records = ps.executeBatch();

		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.BOOK_ADDED));
		}
		System.out.println(records);
		res.setSuccess(true);
		return res;
	}

	public Response updateBook(BookEntity book) {
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.UPDATE_BOOK)) {
			ps.setDouble(QueryConstant.ONE, book.getCost());
			ps.setString(QueryConstant.TWO, book.getBookId());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.BOOK_UPDATED));
		}
		res.setSuccess(true);
		return res;
	}

	public Response deleteBook(String bookId) {
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.DELETE_BOOK)) {
			ps.setString(QueryConstant.ONE, bookId);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.BOOK_DELETED));
		}
		res.setSuccess(true);
		return res;
	}

	public Response deleteBook(String book, String author) {
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.DELETE_BOOK_BY_NAME_AUTHOR)) {
			ps.setString(QueryConstant.ONE, book);
			ps.setString(QueryConstant.TWO, author);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.BOOK_DELETED));
		}
		res.setSuccess(true);
		return res;
	}

	public List<BookEntity> getByAuthor(String author) {
		List<BookEntity> listOfBooks = new ArrayList<>();
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_BY_AUTHOR)) {
			ps.setString(QueryConstant.ONE, author);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				buidBook(listOfBooks, rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.RETRY));
		}
		return listOfBooks;
	}

	public List<BookEntity> getByAuthorAndPublication(String author, String publication) {
		List<BookEntity> listOfBooks = new ArrayList<>();
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_BY_AUTHOR_PUBLICATION)) {
			ps.setString(QueryConstant.ONE, author);
			ps.setString(QueryConstant.TWO, publication);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				buidBook(listOfBooks, rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.RETRY));
		}
		return listOfBooks;
	}

	public List<BookEntity> getByAuthorAndEdition(String author, String edition) {
		List<BookEntity> listOfBooks = new ArrayList<>();
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_BY_AUTHOR_EDITION)) {
			ps.setString(QueryConstant.ONE, author);
			ps.setString(QueryConstant.TWO, edition);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				buidBook(listOfBooks, rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.RETRY));
		}
		return listOfBooks;
	}

	public BookEntity getBookByBookId(String books) {
		BookEntity book = new BookEntity();
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_BY_BOOKID)) {
			ps.setString(QueryConstant.ONE, books);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				buildBook(book, ps);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.RETRY));
		}
		return book;

	}

	public List<BookEntity> getAllBook() {
		List<BookEntity> listOfBooks = new ArrayList<>();
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_ALL_BOOK)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				buidBook(listOfBooks, rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			error.setMessage(MessageBundle.getMessage(Message.RETRY));
		}
		return listOfBooks;

	}

	private void buidBook(List<BookEntity> listOfBooks, ResultSet rs) throws SQLException {
		BookEntity book = new BookEntity();
		book.setBookId(rs.getString(QueryConstant.ONE));
		book.setBookName(rs.getString(QueryConstant.TWO));
		book.setAuthorName(rs.getString(QueryConstant.THREE));
		book.setPublication(rs.getString(QueryConstant.FOUR));
		book.setEdition(rs.getString(QueryConstant.FIVE));
		book.setCost(rs.getDouble(QueryConstant.SIX));
		listOfBooks.add(book);
	}
}
