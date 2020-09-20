package com.onlinelibrary.mapper;

import com.onlinelibrary.entity.UserEntity;

public interface UserMapper {
public abstract com.onlinelibrary.model.UserModel mapToUserModel(UserEntity user);
public abstract  UserEntity mapToUserEntity(com.onlinelibrary.model.UserModel user);
}
