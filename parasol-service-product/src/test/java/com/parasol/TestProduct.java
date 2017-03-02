package com.parasol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.parasol.core.dao.user.UserMapper;
import com.parasol.core.user.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class TestProduct {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testProduct() throws Exception{
		User user = userMapper.selectByPrimaryKey(3);
		System.out.println(user);
	} 
}
