package com.onlinelibrary.dao.impl;

import com.onlinelibrary.dao.UserDao;
import com.onlinelibrary.dao.template.JdbcTemplate;
import com.onlinelibrary.entity.UserEntity;
import com.onlinelibrary.factory.BookFactory;
import com.onlinelibrary.response.Response;
/**
 * <h1> UserDaoImpl implements UserDao. </h1>
 * @author Shail Mishra
 * @version 1.0
 * @since 12-04-2020
 */
public class UserDaoImpl implements UserDao {
private JdbcTemplate template;
	public UserDaoImpl() {
		this.template=BookFactory.getJdbcTemplateInstance();
	}
/**
 * {@inheritDoc}
 */
	@Override
	public Response verifyUser(UserEntity user) {
		Response res = template.verifyUser(user);
		return res;
	}

}
