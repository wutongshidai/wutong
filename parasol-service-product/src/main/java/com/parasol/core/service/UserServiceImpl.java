package com.parasol.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.parasol.core.dao.user.UserMapper;
import com.parasol.core.user.User;
import com.parasol.core.user.UserQuery;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
/*	@Autowired
	private OSSClientUtil ossClient;*/
	
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
	
	   public Boolean updatePassword(String userName , String password) {
		  int i = userMapper.updatePassword(userName , password);
		  return i == 1?Boolean.valueOf(true):Boolean.valueOf(false); 
	   }
	   
	   @Override
	   public Boolean updateByNickNames(User user){
		   int i = userMapper.updateByPrimaryKey(user);
		   System.out.println(i);
		   return i == 1?Boolean.valueOf(true):Boolean.valueOf(false);  
	   }

	   @Override
	   public Boolean updateByNickName(Integer id, String companyName) {
		// TODO Auto-generated method stub
		return null;
	   }
	   
	   
	   
	   
	  
	   
	   
/*	   @Override
	   public String updateHead(MultipartFile file, long userId) throws Exception{
		   if (file == null || file.getSize() <= 0) {
			   throw new Exception("头像不能为空");
		   		}		
		   OSSClientUtil ossClient = new OSSClientUtil();
		   	String name = ossClient.uploadImg2Oss(file);
		   	String imgUrl = ossClient.getImgUrl(name);
		   	//userDao.updateHead(userId, imgUrl);//只是本地上传使用的
		   	System.out.println(imgUrl);
		   	return  imgUrl;
	   }*/
}
