package me.yanmin.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.yanmin.web.dao.IUserDao;
import me.yanmin.web.pojo.User;
import me.yanmin.web.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
}
