package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.dao.TestDAO;
import com.test.model.domain.Test;
import com.test.service.TestService;

/**
 * @author DavidT
 * 
 * Implementation for a TestService
 */
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDAO testDao;
	
	public Test get(Long id) {
		return testDao.get(id);
	}

	public List<Test> list() {
		return testDao.list();
	}
}
