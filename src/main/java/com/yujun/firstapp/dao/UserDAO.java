package com.yujun.firstapp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.yujun.firstapp.Dto.User;

@Mapper
public interface UserDAO {
	public User getUser(String id);
}
