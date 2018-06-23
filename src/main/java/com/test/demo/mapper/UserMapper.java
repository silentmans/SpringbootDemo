package com.test.demo.mapper;

import org.apache.ibatis.annotations.Select;

import com.test.demo.entity.User;

public interface UserMapper {

	@Select("select * from user where id = #{id}")
	public User getUserById(Integer id);
	
}