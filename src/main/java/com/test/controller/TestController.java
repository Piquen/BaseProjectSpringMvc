package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.domain.Test;
import com.test.service.TestService;

/**
 * @author DavidT
 * 
 * Test controller
 */
@Controller
public class TestController {

	@Autowired
	private TestService service;
	
	protected static final String MODEL_VIEW   = "test";
	protected static final String MODEL_ENTITY = "testEntity";
	
	/*
	 * URL in browser:  http://localhost:8081/TestProyect/test/100
	 */
	protected static final String URL_BASE     = "/test/{id}";
	
	/**
	 * Test detail method
	 * @param modelMap ModelMap
	 * @param id Id Test
	 * @return view
	 */
	@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
	public String detalle(ModelMap modelMap, @PathVariable Long id){
		
		Test entity = service.get(id);
		modelMap.addAttribute(MODEL_ENTITY, entity);
		
		return MODEL_VIEW;
	}
}
