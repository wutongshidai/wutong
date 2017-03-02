package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.TestDao;
import com.parasol.core.pojo.TsetTb;


@Service
@Transactional
public class TestTbServiceImpl implements TestTbService {
	
	@Autowired
	private TestDao testDao;

	@Override
	public void insertTestTb(TsetTb tsetTb) {
		testDao.insertTestTb(tsetTb);
		
		throw new RuntimeException();
	}

}
