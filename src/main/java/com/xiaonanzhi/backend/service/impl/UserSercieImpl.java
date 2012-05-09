package com.xiaonanzhi.backend.service.impl;

import com.xiaonanzhi.backend.daoMapper.UserMapper;
import com.xiaonanzhi.backend.domain.User;
import com.xiaonanzhi.backend.service.UserService;
/**
 * 
 * @author zhaopoingfei
 *
 * 2012-4-15
 */
public class UserSercieImpl implements UserService {
	
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(int id) {
		return userMapper.getUser(id);
	}

}
