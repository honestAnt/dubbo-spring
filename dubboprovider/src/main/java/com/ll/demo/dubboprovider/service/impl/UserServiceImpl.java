package com.ll.demo.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ll.demo.dubboInterface.entity.User;
import com.ll.demo.dubboInterface.service.UserService;


@Service(version="1.0.1")
public class UserServiceImpl implements UserService {

	@SuppressWarnings({ "deprecation", "null" })
	@Override
	public User save(User user) {
		user.setUserId(++UserIdGenerator.id);
		return user;
	}

}
