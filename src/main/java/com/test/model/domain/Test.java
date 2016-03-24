package com.test.model.domain;

import javax.persistence.Entity;

/**
 * @author DavidT
 * 
 * This is the test entity
 */
@Entity
public class Test {

	private Long id;
	private String code;
	
	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the code
	 */
	public final String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public final void setCode(String code) {
		this.code = code;
	}
}
