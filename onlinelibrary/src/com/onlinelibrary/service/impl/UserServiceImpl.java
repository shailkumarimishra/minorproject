package com.onlinelibrary.service.impl;

import com.onlinelibrary.constant.Message;
import com.onlinelibrary.dao.UserDao;
import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.mapper.UserMapper;
import com.onlinelibrary.model.UserModel;
import com.onlinelibrary.response.Response;
import com.onlinelibrary.service.UserService;
import com.onlinelibrary.util.MessageBundle;
/**
 * <h1>UserServiceImpl implements UserService.</h1>
 * 
 * @author Shail Mishra
 * @version 1.0
 * @since 12-04-2020
 */
public class UserServiceImpl implements UserService {
	private UserDao dao;
	private UserMapper map;

	public UserServiceImpl() {
		this.dao = BookFactory.getDaoInstance();
		this.map = BookFactory.getMapperInstance();
	}
/**
 * {@inheritDoc}
 */
	@Override
	public String verifyUser(UserModel user) {
		Response res = dao.verifyUser(map.mapToUserEntity(user));
		if (res.isSuccess())
			return MessageBundle.getMessage(Message.VALID_ACCOUNT);
		 else 
			return MessageBundle.getMessage(Message.INVALID_ACCOUNT);
	}

}
