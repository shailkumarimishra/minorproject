package com.onlinelibrary.dao;

import com.onlinelibrary.entity.UserEntity;
import com.onlinelibrary.response.Response;
/**
 * <h1> UserDao exposes services related to user. </h1>
 * 
 * @author Shail Mishra
 * @version 1.0
 * @since 12-04-2020
 *
 */
public interface UserDao {
	/**
	 * verifyUser takes user account details and verify it. 
	 * @param user UserEntity
	 * @return Response {@link Response} as true if verified 
	 * 		   else return Response as false.
	 * 
	 */
	public abstract Response verifyUser(UserEntity user);
}
