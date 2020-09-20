package com.onlinelibrary.sqlqueries;

public class SQLQuery {
	public static final String SELECT_USER = "select * from user_info where username=? and password=?";
	public static final String INSERT_BOOK = "insert into book values(?,?,?,?,?,?)";
	public static final String UPDATE_BOOK = "update book set cost=? where book_id=?";
	public static final String DELETE_BOOK = "delete from book where book_id=?";
	public static final String DELETE_BOOK_BY_NAME_AUTHOR = "delete from book where book_name=? and author_name=?";
	public static final String SELECT_BY_AUTHOR = "select * from book where author_name=?";
	public static final String SELECT_BY_AUTHOR_EDITION = "select * from book where author_name=? and edition=?";
	public static final String SELECT_BY_AUTHOR_PUBLICATION = "select * from book where author_name=? and publication=?";
	public static final String SELECT_BY_BOOKID = "select * from book where book_id=?";
	public static final String SELECT_ALL_BOOK = "select * from book";

}
