package com.yujun.firstapp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yujun.firstapp.dto.User;

@Mapper
public interface UserDAO {
	public User getUser(String id);
}
