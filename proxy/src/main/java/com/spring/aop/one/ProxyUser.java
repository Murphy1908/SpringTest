package com.spring.aop.one;

/**
 * 创建代理类
 */

public class ProxyUser implements UserService {

	//真实类
	private UserService userService;
	
	//事务类
	private MyTransaction transaction;
	
	public ProxyUser(UserService userService, MyTransaction transaction) {
		super();
		this.userService = userService;
		this.transaction = transaction;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		transaction.before();
		userService.addUser(user);
		transaction.after();
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		transaction.before();
		userService.deleteUser(uid);
		transaction.after();
	}

}
