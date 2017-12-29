package com.parasol.core.service;

import com.parasol.core.user.User;

public interface UserService {
	
	public int insert(User user);
	public User selectByPrimaryKey(Integer id);
	public User selectUserByUsername(String username);
	public User selectByMobile(String mobile);
	
	
	public Boolean updatePassword(String userName , String password);
	public Boolean updateByNickName(Integer id , String companyName);
	public Boolean updateByNickNames(User user);
	
	public User selectUser(String userName);
	
	
	
	/*String updateHead(MultipartFile file, long userId) throws Exception ;*/
}
