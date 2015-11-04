package com.ll.demo.dubboInterface.service;

import com.ll.demo.dubboInterface.entity.User;

public interface UserService {

	/**
	 * ����User,���������
	 * @param user
	 * @return
	 */
	public User save(User user);
}
