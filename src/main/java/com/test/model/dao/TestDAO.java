package com.test.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.model.domain.Test;

/**
 * @author DavidT
 * 
 * Interface for TestDAO
 */
@Repository
public interface TestDAO {
	
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
