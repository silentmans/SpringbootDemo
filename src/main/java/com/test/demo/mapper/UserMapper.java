package com.test.demo.mapper;

import org.apache.ibatis.annotations.Select;

import com.test.demo.bean.User;

public interface UserMapper {

	@Select("select user.id, user.name from user where id = #{id}")
	public User getUserById(Integer id);
	
}