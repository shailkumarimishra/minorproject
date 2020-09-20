package com.onlinelibrary.factory;

import com.onlinelibrary.dao.BookDao;
import com.onlinelibrary.dao.UserDao;
import com.onlinelibrary.dao.impl.BookDaoImpl;
import com.onlinelibrary.dao.impl.UserDaoImpl;
import com.onlinelibrary.dao.template.JdbcTemplate;
import com.onlinelibrary.exception.ErrorMessage;
import com.onlinelibrary.mapper.BookMapper;
import com.onlinelibrary.mapper.UserMapper;
import com.onlinelibrary.mapper.impl.BookMapperImpl;
import com.onlinelibrary.mapper.impl.UserMapperImpl;
import com.onlinelibrary.response.Response;
import com.onlinelibrary.service.BookService;
import com.onlinelibrary.service.UserService;
import com.onlinelibrary.service.impl.BookServiceImpl;
import com.onlinelibrary.service.impl.UserServiceImpl;

public class BookFactory {
	public static UserMapper getMapperInstance() {
		return new UserMapperImpl();
	}

	public static UserService getServiceInstance() {
		return new UserServiceImpl();
	}

	public static UserDao getDaoInstance() {
		return new UserDaoImpl();
	}

	public static JdbcTemplate getJdbcTemplateInstance() {
		return new JdbcTemplate();
	}

	public static Response getResponseInstance() {
		return new Response();
	}

	public static ErrorMessage getErrorMessageInstance() {
		return new ErrorMessage();
	}

	public static BookDao getBookDaoInstance() {
		return new BookDaoImpl();
	}

	public static BookMapper getBookMapperInstance() {
		return new BookMapperImpl();
	}

	public static BookService getBookServiceInstance() {
		return new BookServiceImpl();
	}

}
