package com.wanhang.ydsj.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.wanhang.ydsj.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public long addUser() {
		return new Random(100).nextLong();
	}

}
