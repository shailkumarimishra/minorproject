package com.onlinelibrary.service;

import com.onlinelibrary.model.UserModel;
/**
 * <h1>UserService exposes services related to user.</h1>
 * 
 * @author Shail Mishra
 * @version 1.0
 * @since 12-04-2020
 */
public interface UserService {
	/**
	 *  verifyUser takes user account details and verify it.
	 *  
	 * @param user UserModel
	 * @return String, if verified return "Valid Account" else return "Invalid Account"
	 */
	public abstract String verifyUser(UserModel user);

}
