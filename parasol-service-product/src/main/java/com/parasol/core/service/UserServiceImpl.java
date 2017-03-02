package com.parasol.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.user.UserMapper;
import com.parasol.core.user.User;
import com.parasol.core.user.UserQuery;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	public User selectUserByUsername(String username){
		UserQuery userQuery = new UserQuery();
		userQuery.createCriteria().andUserNameEqualTo(username);
		List<User> users = userMapper.selectByExample(userQuery);
		if(null != users && users.size() > 0){
			return users.get(0);
		}else{
			return null;
		}
	}
	
	public User selectByMobile(String mobile){
		UserQuery userQuery = new UserQuery();
		userQuery.createCriteria().andMobileEqualTo(mobile);
		List<User> users = userMapper.selectByExample(userQuery);
		if(null != users && users.size() > 0){
			return users.get(0);
		}else{
			return null;
		}
	}
}
