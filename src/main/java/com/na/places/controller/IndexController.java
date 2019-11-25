package com.na.places.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for API information
 * @author amon
 *
 */
@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String index()
	{
		return "Welcome to the places API";
	}
	
}
