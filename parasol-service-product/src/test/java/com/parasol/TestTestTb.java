package com.parasol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.parasol.core.dao.TestDao;
import com.parasol.core.pojo.TsetTb;
import com.parasol.core.service.TestTbService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class TestTestTb {
	@Autowired
//	private TestDao testDao;
	private TestTbService testTbService;
	
	@Test
	public void testAdd() throws Exception{
		TsetTb tsetTb = new TsetTb();
		tsetTb.setAdfp("大夫");
		tsetTb.setCheshi("法律");
		tsetTb.setId(5);
		tsetTb.setMoney(22.11);
		testTbService.insertTestTb(tsetTb);
	
	}
	
}
