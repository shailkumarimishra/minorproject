package com.onlinelibrary.util;

import java.util.ResourceBundle;

public class MessageBundle {
	public static String getMessage(String key) {
		ResourceBundle rb = ResourceBundle.getBundle("message");
		return rb.getString(key);
	}
	
	public static String getDBInfo(String key) {
		ResourceBundle rb = ResourceBundle.getBundle("dbinfo");
		return rb.getString(key);
	}


}
