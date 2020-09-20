package com.onlinelibrary.mapper.impl;

import com.onlinelibrary.entity.UserEntity;
import com.onlinelibrary.mapper.UserMapper;
import com.onlinelibrary.model.UserModel;

public class UserMapperImpl implements UserMapper{

	@Override
	public UserModel mapToUserModel(UserEntity user) {
		UserModel userModel=new UserModel();
		userModel.setUsername(user.getUsername());
		userModel.setPassword(user.getPassword());
		return userModel;
	}

	@Override
	public UserEntity mapToUserEntity(UserModel user) {
		UserEntity userEntity=new UserEntity();
		userEntity.setUsername(user.getUsername());
		userEntity.setPassword(user.getPassword());
		return userEntity;
	}

}
