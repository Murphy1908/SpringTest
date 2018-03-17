package com.spring.aop.two;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("增加 User");
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		System.out.println("删除 User");
	}

}
