package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.model.domain.Test;

/**
 * @author DavidT
 * 
 * Interface for TestService
 */
@Service
public interface TestService {

	/**
	 * Get a test by id
	 * @param id Test id
	 * @return Test
	 */
	Test get(Long id);
	
	/**
	 * Get a list test
	 * @return list
	 */
	List<Test> list();
}
