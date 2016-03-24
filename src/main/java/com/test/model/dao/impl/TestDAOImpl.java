package com.test.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.model.dao.TestDAO;
import com.test.model.domain.Test;

/**
 * @author DavidT
 * 
 * Implementation for TestDAO
 */
@Repository
public class TestDAOImpl implements TestDAO {

	public Test get(Long id) {
		Test test = new Test();
		test.setId(100L);
		test.setCode("testCode");
		return test;
	}

	public List<Test> list() {
		List<Test> list = new ArrayList<Test>();
		return list;
	}
}
