package com.xiaonanzhi.backend.daoMapper;

import org.apache.ibatis.annotations.Select;

import com.xiaonanzhi.backend.domain.User;

/**
 * 
 * @author zhaopoingfei
 *
 * 2012-4-15
 */
public interface UserMapper {
	
	@Select("select * from User where id=#{id}")
	public User getUser(int id);
}
